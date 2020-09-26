/**
 * 
 */
package mypack;

import java.util.List;

/**
 * @author tushank
 *
 */
public interface ProductDAO {
	void addProduct(Product ref);
	List<?> getAllProducts();
}
