package leaveapplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecondPageController{
	
	@RequestMapping("/secondpage")
	public ModelAndView secondPage() {
		
		String[] msg = {"Jason", "Bajade"};
		
		ModelAndView model = new ModelAndView("add_employee");
		model.addObject("secondMessage", msg);
		
		return model;
	}
}