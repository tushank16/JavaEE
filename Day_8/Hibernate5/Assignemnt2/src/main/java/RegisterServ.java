import javax.servlet.annotation.WebServlet;
import java.io.*;
import mypack.Register;
import mypack.HibernateUtil;
import org.hibernate.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServ
 */
@WebServlet("/RegisterServ") 
public class RegisterServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Session session;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			session = HibernateUtil.getSessionFactory().openSession(); 
			System.out.println("after change");
			response.setContentType("text/html");
			/*name,address,email-id,login,password*/

			PrintWriter out=response.getWriter();
			
			/*Requesting the values of name,address,email,login,password from register.jsp and saving it into string*/
			String name=request.getParameter("name");
			String address=request.getParameter("address");
			String email=request.getParameter("email");
			String login=request.getParameter("login");
			String password=request.getParameter("password");

			//creating object of entity
			Register ref=new Register();
			ref.setName(name);
			ref.setAddress(address);
			ref.setEmail(email);
			ref.setLogin(login);
			ref.setPassword(password);
			
			Transaction tx = session.beginTransaction();
			session.save(ref);
			tx.commit();
			session.close();
			out.println("Entry added in the database");
		}
		catch(Exception ee)
		{
			System.out.println("in service  "+ee);
		}
	}

}
