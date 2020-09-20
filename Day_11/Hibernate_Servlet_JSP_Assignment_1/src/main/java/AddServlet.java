

import java.io.IOException;
//import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.Transaction;
import mypack.HibernateUtil;
import mypack.Product;

/**
 * Servlet implementation class AddServlet
 */
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Session session;
   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try
		{
			session = HibernateUtil.getSessionFactory().openSession(); 
			response.setContentType("text/html");
			//PrintWriter out=response.getWriter();
			/*int qty, price;
			String pname;*/
			/*Requesting the values of name,address,email,login,password from register.jsp and saving it into string*/
			String pname=request.getParameter("pname");
			int qty = Integer.parseInt(request.getParameter("qty"));
			int price = Integer.parseInt(request.getParameter("price"));
			//creating object of entity
			Product ref=new Product();
			ref.setPname(pname);
			ref.setPrice(price);
			ref.setQty(qty);
			
			Transaction tx = session.beginTransaction();
			session.save(ref);
			tx.commit();
			session.close();
			response.sendRedirect("Home.jsp");
			//out.println(pname+"\t"+qty+"\t"+price);
		}
		catch(Exception ee)
		{
			System.out.println("in service  "+ee);
		}
	}

}