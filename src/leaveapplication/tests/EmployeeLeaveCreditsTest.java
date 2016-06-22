package leaveapplication.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmployeeLeaveCreditsTest {
	private Employee employee;
	
	@Before
	public void setUp() {
		employee = new Employee();
	}

	@Test
	public void employeeShouldGainSLCredits() throws Exception{
		float creditsBefore = employee.getSLCredits();
		employee.gainSLCredits();
		assertEquals(creditsBefore + 1.25, employee.getSLCredits(), 0);
	}
	
	@Test
	public void employeeShouldGainVLCredits() throws Exception {
		float creditsBefore = employee.getVLCredits();
		employee.gainVLCredits();
		assertEquals(creditsBefore + 1.25, employee.getVLCredits(), 0);
	}

}
