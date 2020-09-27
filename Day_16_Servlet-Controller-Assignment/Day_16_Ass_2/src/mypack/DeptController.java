package mypack;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Component
@Controller
public class DeptController {

	@Autowired
	DeptDAO ddao;
	
	@GetMapping("dept")
	public String before()
	{
 		return "Dept";
	}
	
	@PostMapping("dept")
	public String afterSubmit(HttpServletRequest request)
	{
		//String loc =  request.getParameter("loc");
		List<?> mylist= ddao.searchByDept(request.getParameter("loc"));
		/*
		return new ModelAndView("dept","mylist",mylist);
		*/
		request.setAttribute("mylist", mylist);
		return "Dept";
	}

}
