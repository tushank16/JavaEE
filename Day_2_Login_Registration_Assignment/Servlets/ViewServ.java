

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewServ
 */
@WebServlet("/ViewServ")
public class ViewServ extends HttpServlet {
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
		try
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
		    pw.println("Registerd Names");
		    pw.println("<br>");
		    Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("select * from register");
			
			while(rs.next())
			{
				String name=rs.getString("name");
				String add=rs.getString("address");
				String email=rs.getString("email");
				String username=rs.getString("username");
				String psw=rs.getString("psw");
				pw.println(name+"\t"+add+"\t"+email+"\t"+username+"\t"+psw);
			    pw.println("<br>");

			}
			
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}

}
