

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CartServ
 */
@WebServlet("/CartServ")
public class CartServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		List<String> mylist = new ArrayList<String>();
		String[] purans = request.getParameterValues("purans");
		  for(String names:purans)
		  {
			  mylist.add(names);
		  }
		HttpSession session=request.getSession();
		session.setAttribute("purans",mylist);
		PrintWriter out=response.getWriter();
		out.println("<h1>Products succesffully added into cart </h1><br><br>");
		out.println("<a href='ViewServ'>View Cart</a>");
	}

}
