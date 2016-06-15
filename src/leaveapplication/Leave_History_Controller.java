package leaveapplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Leave_History_Controller{
	
	@RequestMapping("/view_leave_history")
	public ModelAndView secondPage() {
		
		ModelAndView model = new ModelAndView("leave_history");
		
		return model;
	}
}