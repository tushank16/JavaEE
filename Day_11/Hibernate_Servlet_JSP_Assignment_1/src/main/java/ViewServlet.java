import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.query.Query;

import mypack.HibernateUtil;
import mypack.Product;

/**
 * Servlet implementation class ViewServlet
 */
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Session session;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			session = HibernateUtil.getSessionFactory().openSession(); 
			response.setContentType("text/html");
			
			//PrintWriter out = response.getWriter();
			
			Query<?>  query = session.createQuery("from Product");
			List<Product> mylist1=(List<Product>) query.list();
			
			//System.out.println(mylist1);
			request.setAttribute("record", mylist1);
			RequestDispatcher rd = request.getRequestDispatcher("View.jsp");
			rd.forward(request, response);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
