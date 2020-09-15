

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		List<String> mylist = new ArrayList<String>();
		mylist.add("Shriraj");
		mylist.add("Nihir");
		mylist.add("Tushank");
		mylist.add("Ojas");
		mylist.add("Prasanna");
		mylist.add("Rishikesh");
		session.setAttribute("Mylist",mylist);
		PrintWriter out=response.getWriter();
		out.println("arraylist stored in Session. Now open MyJsp");
		
	}

}
