package leaveapplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Apply_Leave_Controller{
	
	@RequestMapping("/apply_leave")
	public ModelAndView secondPage() {
		
		ModelAndView model = new ModelAndView("apply_leave");
		
		return model;
	}
}