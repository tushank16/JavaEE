package mypack;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@Autowired
	LoginDAO ldao;
	@GetMapping("new_login")
	public ModelAndView before()
	{
		Login ref=new Login();
		return new ModelAndView("Login","mylogin",ref);
	}
	@PostMapping("new_login")
	public String afterSubmit(@Valid @ModelAttribute("mylogin")Login login,BindingResult result)
	{
		if(result.hasFieldErrors())
		{
			return "Login";
		}
		ldao.add(login);
		return "success";
	}
}
