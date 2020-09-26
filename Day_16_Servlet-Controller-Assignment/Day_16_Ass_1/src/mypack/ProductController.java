/**
 * 
 */
package mypack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author tusha
 *
 */
@Controller
public class ProductController {

	@Autowired
	ProductDAO pda;

	@GetMapping("new_product")
	public ModelAndView before()
	{
		System.out.println("inside get new product");
		Product ref = new Product();
		return new ModelAndView("Add","Myproduct",ref);
	}
	@PostMapping("new_product")
	public String afterSubmit(Product Product)
	{
		System.out.println("inside post new product");
		pda.addProduct(Product);
		return "Home";
	}
	
	@GetMapping("view")
	public ModelAndView show()
	{
		System.out.println("inside view");
		List<?> mylist=pda.getAllProducts();
		return new ModelAndView("View","mylist",mylist);
	}
}
