

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServ
 */
public class MainServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try{
			response.setContentType("text/html");
			String name=request.getParameter("name");
			String pass=request.getParameter("password");
			//PrintWriter pw=response.getWriter();
			//pw.println(name+"    "+pass);
			
			if(name.equalsIgnoreCase("scott") && pass.equalsIgnoreCase("tiger"))
			{
				response.sendRedirect("Welcome.jsp");
			}
			else
			{
				response.sendRedirect("index.jsp");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
