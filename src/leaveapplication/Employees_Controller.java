package leaveapplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Employees_Controller{
	
	@RequestMapping("/view_all_employees")
	public ModelAndView secondPage() {
		
		ModelAndView model = new ModelAndView("employee_list");
		
		return model;
	}
}