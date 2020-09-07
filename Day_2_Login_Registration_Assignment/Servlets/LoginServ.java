

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
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
	private Connection conn;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String Login=request.getParameter("username");
			String Password=request.getParameter("psw");
			

			PreparedStatement pst=conn.prepareStatement("Select * from register where username=? AND psw=?");
			pst.setString(1,Login);
			pst.setString(2,Password);
			
			ResultSet r1=pst.executeQuery();
			if(r1.next()) {
				try
				{
					RequestDispatcher rd=request.getRequestDispatcher("success.html");
					rd.forward(request,response);
				}
				catch(Exception ee)
				{
					System.out.println("in forwarding"+ee);
				}
			}else {
				try
				{
					RequestDispatcher rd=request.getRequestDispatcher("fail.html");
					rd.forward(request,response);
				}
				catch(Exception ee)
				{
					System.out.println("in forwarding"+ee);
				}
			}
			
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		
	}

}
