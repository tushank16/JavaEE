/**
 * 
 */
package mypack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author tushank
 *
 */
@Controller
public class PersonController
{
	@GetMapping("person")
	public ModelAndView before()
	{
		Person ref = new Person();
		return new ModelAndView("person","myPerson",ref);
	}
	
	@PostMapping("person")
	public String afterSubmit(@ModelAttribute("Person") Person Person) 
	{
		System.out.println("inside afterSubmit\t"+Person);
		return "View";
	}
}
