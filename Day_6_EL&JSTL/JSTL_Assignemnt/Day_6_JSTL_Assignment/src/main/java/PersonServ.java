import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypack.Person;

/**
 * Servlet implementation class PersonServ
 */
public class PersonServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

			Person p1=new Person();
			p1.setName("abc");
			p1.setAge(20);

			Person p2=new Person();
			p2.setName("Xyz");
			p2.setAge(25);

			Person p3=new Person();
			p3.setName("tushank");
			p3.setAge(24);
			
			List<Person>personlist=new ArrayList<Person>();
			personlist.add(p1);
			personlist.add(p2);
			personlist.add(p3);

			request.setAttribute("mylist",personlist);
			RequestDispatcher rd = request.getRequestDispatcher("Result.jsp");
			rd.forward(request, response);
		
	}

}
