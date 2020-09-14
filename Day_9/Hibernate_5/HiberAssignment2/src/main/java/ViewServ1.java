

import org.hibernate.query.Query;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.*;

import mypack.HibernateUtil;
import mypack.Register;

/**
 * Servlet implementation class ViewServ1
 */
public class ViewServ1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Session session;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		session = HibernateUtil.getSessionFactory().openSession(); 
		response.setContentType("text/html");
		
		//PrintWriter out = response.getWriter();
		
		Query<?>  query = session.createQuery("from Register");
		List<Register> mylist1=(List<Register>) query.list();
		
		//System.out.println(mylist1);
		request.setAttribute("record", mylist1);
		RequestDispatcher rd = request.getRequestDispatcher("View.jsp");
		rd.forward(request, response);
		
	}

	
}
