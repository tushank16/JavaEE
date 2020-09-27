/**
 * 
 */
package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author tusha
 *
 */
@Component
@Transactional
public class LoginDAOImpl implements LoginDAO {

	@Autowired
	private HibernateTemplate template;
	
	@Override
	public void add(Login ref) {
		template.save(ref);
		
	}

}
