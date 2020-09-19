

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServ
 */
@WebServlet("/LoginServ")
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try 
		{
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			//PrintWriter out =  response.getWriter();
			//out.println(username+"\t"+password);
			Boolean login= LoginBean.validate(username, password);
			/*PrintWriter out =  response.getWriter();
			out.println(login+"\t"+username+"\t"+password);*/
			if(login)
			{
				request.setAttribute("login", username);
				RequestDispatcher rd=request.getRequestDispatcher("Success.jsp");
				rd.forward(request, response);
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("Fail.jsp");
				rd.forward(request, response);
			}
		
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}

}
