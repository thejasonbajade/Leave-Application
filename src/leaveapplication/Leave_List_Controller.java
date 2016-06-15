package leaveapplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Leave_List_Controller{
	
	@RequestMapping("/view_all_leave_histories")
	public ModelAndView secondPage() {
		
		ModelAndView model = new ModelAndView("leave_list");
		
		return model;
	}
}