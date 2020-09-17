import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class StudentServ
 */
public class StudentServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection conn;
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String ss="jdbc:mysql://localhost:3306/mydb";
			conn=DriverManager.getConnection(ss,"root","root");
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try 
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			int rollno=Integer.parseInt(request.getParameter("rollno"));
			String name=request.getParameter("name");
			int age=Integer.parseInt(request.getParameter("age"));
			String address=request.getParameter("address");
			
			PreparedStatement pst=conn.prepareStatement("insert into stdnt values(?,?,?,?)");
			pst.setInt(1,rollno);
			pst.setString(2,name);
			pst.setInt(3,age);
			pst.setString(4,address);
			int k=pst.executeUpdate();
			if(k>0)
			{
				//pw.println("record added");
				Statement st=conn.createStatement();
				ResultSet rs=st.executeQuery("select rollno from stdnt");
				List<Integer> record=new ArrayList<Integer>();
				while(rs.next())
				{
					record.add(rs.getInt(1));
				}
				//pw.println(record);
				//HttpSession session=request.getSession();
				request.setAttribute("record",record);
				RequestDispatcher rd=request.getRequestDispatcher("Report.jsp");
				rd.forward(request,response);
			}
			else
			{
				pw.println("record not added");
			}	
		
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}

}


