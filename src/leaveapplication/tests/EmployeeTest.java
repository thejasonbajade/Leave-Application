package leaveapplication.tests;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;

import org.junit.Test;

public class EmployeeTest {
	
	@Test
	public void nonAlphabeticCharacterInFirstNameRaisesException() throws Exception {
		try {
			new Employee().setFirstName("Robert3");
			fail("setFirstName() method should throw an exception if"
					+ "the first name contains a number "
					+ "or a special character");
		} catch (InvalidInputException expected) {
			
		}
	}
	
	@Test
	public void nonAlphabeticCharacterInLastNameRaisesException() throws Exception {
		try {
			new Employee().setLastName("3Robert");
			fail("setLastName() method should throw an exception if"
					+ "the first name contains a number "
					+ "or a special character.");
		} catch (InvalidInputException expected) {
			
		}
	}

	@Test
	public void puttingNonNumbericCharactersInPhoneNumberRaisesException() 
			throws Exception {
		try {
			new Employee().setPhoneNumber("abcdefghik");
			fail("setPhoneNumber() method should throw an exception "
					+ "if the phone number contains a non-numeric character");
		} catch (InvalidInputException expected) {
			
		}
	}
	
	@Test
	public void puttingNotTenDigitsInPhoneNumberRaisesException() 
			throws Exception {
		try {
			new Employee().setPhoneNumber("92764775858");
			fail("setPhoneNumber() method should throw an exception "
					+ "if the number of digits in the phone number is not"
					+ "to ten.");
		} catch (InvalidInputException expected) {
			
		}
	}
	
	@Test
	public void settingEmploymentDateOfEmployeeToAFutureDateRaisesException() throws Exception {
		try {
			new Employee().setEmploymentDate(new GregorianCalendar(2016,6,16));
			fail("setEmploymentDate() method should throw an exception "
					+ "if the date input is a future date");
		} catch (InvalidInputException e) {
			// TODO: handle exception
		}
	}

}
