/**
 * 
 */
package mypack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author tushank
 *
 */

@Component
@Transactional
public class ProductDAOImpl implements ProductDAO {


	@Autowired
	private HibernateTemplate template;

	@Override
	public List<?> getAllProducts() {
		return  template.find("from Product");
	}

	@Override
	public void addProduct(Product ref) {
		template.save(ref);
	}

}
