package leaveapplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Notify_Controller{
	
	@RequestMapping("/notify")
	public ModelAndView secondPage() {
		
		ModelAndView model = new ModelAndView("notify");
		
		return model;
	}
}