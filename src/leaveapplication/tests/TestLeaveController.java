package leaveapplication.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import leaveapplication.LeaveController;

public class TestLeaveController {

	@Test
	public void validLeaveApplicationShouldRedirectToLeaveHistoryPage() 
			throws Exception {
		MockHttpServletRequest request = new MockHttpServletRequest();
		request.addParameter("leave_type", "validtype");
		request.addParameter("supervisor", "validsupervisor");
		request.addParameter("start_date", "validstartdate");
		request.addParameter("end_date", "validenddate");
		request.addParameter("number_of_days", "valid_number_of_days");
		request.addParameter("reason", "valid_reason");
		
		MockHttpServletResponse response = new MockHttpServletResponse();
		
		LeaveController c = new LeaveController();
		ModelAndView v = c.handleRequest(request, response);
		assertEquals("view_leave_history", v.getViewName());
	}

}
