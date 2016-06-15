package leaveapplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LeaveController{
	
	@RequestMapping("/view_all_leave_histories")
	public ModelAndView showAllLeaveHistories() {
		
		ModelAndView model = new ModelAndView("leave_list");
		
		return model;
	}
	
	@RequestMapping("/view_leave_history")
	public ModelAndView showOwnLeaveHistory() {
		
		ModelAndView model = new ModelAndView("leave_history");
		
		return model;
	}
	
	@RequestMapping("/apply_leave")
	public ModelAndView applyLeave() {
		
		ModelAndView model = new ModelAndView("apply_leave");
		
		return model;
	}
}