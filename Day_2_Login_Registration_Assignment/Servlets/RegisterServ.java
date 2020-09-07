import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServ
 */
@WebServlet("/RegisterServ")
public class RegisterServ extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	private Connection conn;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/mydb";
			conn=DriverManager.getConnection(url,"root","root");
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try {
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			
			//pw.println("hello");
			String name=request.getParameter("name");
			String address =request.getParameter("address");
			String email=request.getParameter("email");
			String username =request.getParameter("username");
			String pwd=request.getParameter("psw");

			PreparedStatement pst=conn.prepareStatement("insert into register values(?,?,?,?,?)");
			pst.setString(1,name);
			pst.setString(2,address);
			pst.setString(3,email);
			pst.setString(4,username);
			pst.setString(5,pwd);
			
			int k=pst.executeUpdate();
			if(k>0)
			{
				pw.println("Record has been added");
				RequestDispatcher rd=request.getRequestDispatcher("login.html");
				rd.forward(request,response);
			}
			else
			{
				pw.println("cannot add");
			}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}

}
