/**
 * 
 */
package mypack;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author tusha
 *
 */
public class StudentDAODataImpl implements StudentDAO {

	public void addStudent(Student ref) {
		Session session;
		session = HibernateUtil.getSessionFactory().openSession(); 
		Transaction tx = session.beginTransaction();
		session.save(ref);
		tx.commit();
		session.close();
	}

}
