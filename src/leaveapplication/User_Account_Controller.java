package leaveapplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class User_Account_Controller{
	
	@RequestMapping("/account_info")
	public ModelAndView helloWorld() {
		ModelAndView model = new ModelAndView("account_info");
		model.addObject("welcomeMessage", "Hi Jason Bajade");
		
		return model;
	}
}
