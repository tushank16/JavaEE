

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	protected Connection conn;
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
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("select loc from dept");
			List<String> loc = new ArrayList<String>();
			while(rs.next())
			{
				loc.add(rs.getString("loc"));
			}
			System.out.println(loc);
			request.setAttribute("Location",loc);
			RequestDispatcher rd=request.getRequestDispatcher("Servlet2");
			rd.forward(request,response);

		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}

}
