package mypack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class DeptDAOImpl implements DeptDAO {

	@Autowired
	private HibernateTemplate template;
	
	@Override
	public List<?> searchByDept(String ref) {
		return  template.findByNamedParam("from Dept where loc=:abc", "abc", ref);
	}

}
