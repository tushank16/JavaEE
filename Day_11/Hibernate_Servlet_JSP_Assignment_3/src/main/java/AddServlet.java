import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mypack.*;

/**
 * Servlet implementation class AddServlet
 */
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
		try
		{
			StudentDAO sdao;
			
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			/*Requesting the values of name,address from Add.jsp and saving it into string*/
			String name=request.getParameter("name");
			String address=request.getParameter("address");
			String persistence = request.getParameter("persistence");
			
			//creating object of entity	
			Student ref=new Student();
			ref.setName(name);
			ref.setAddress(address);
	
			
			if(persistence.contains("file"))
			{
				ref.setRollno(0);
				sdao = new StudentDAOFileImpl();
				sdao.addStudent(ref);
				out.println("Object added In File");
			}
			
			if(persistence.contains("database"))
			{
				sdao = new StudentDAODataImpl();
				sdao.addStudent(ref);
				out.println("Object added In Database");
			}
			
		}
		catch(Exception ee)
		{
			System.out.println("in service  "+ee);
		}
	}

}