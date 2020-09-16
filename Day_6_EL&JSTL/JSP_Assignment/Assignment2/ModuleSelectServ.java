

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ModuleSelectServ
 */
public class ModuleSelectServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModuleSelectServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try{
			response.setContentType("text/html");
			String module=request.getParameter("module");
			//PrintWriter pw=response.getWriter();
			//pw.println(module);
			
			if(module.contentEquals("C++"))
			{
				response.sendRedirect("C++.jsp");
			}
			else if(module.contentEquals("java"))
			{
				response.sendRedirect("java.jsp");
			}
			else if(module.contentEquals("oracle"))
			{
				response.sendRedirect("oracle.jsp");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
