package leaveapplication.tests;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;

import org.junit.Test;

public class LeaveFilingTest {

	@Test
	public void selectingEarlierEndDateThanStartDate() throws Exception {
		try {
			new Leave().setSchedule(new GregorianCalendar(2016, 05, 17), new GregorianCalendar(2016, 05, 13));
			fail("setSchedule() should return error message");
		} catch (InvalidInputException e) {
			// TODO: handle exception
		}
	}

	// @Test
	// public void warnUserIfEndDateIsYearsAheadOfStart() throws Exception {
	// new Leave().checkDifferenceOfStartAndEnd(new
	// GregorianCalendar(2016,5,16), new GregorianCalendar(2017,5,16));
	// }
	//
	// @Test
	// public void checkIfUserSelectsOverlappingStartDate() throws Exception {
	//
	// }
	//
	// @Test
	// public void checkIfUserSelectsOverlappingEndDate() throws Exception {
	//
	// }
	//
	@Test
	public void computeForDurationOfLeaves() throws Exception {
		double duration = new Leave().computeDurationOfLeaves(new GregorianCalendar(2016, 5, 6), false,
				new GregorianCalendar(2016, 5, 6), false);
		assertEquals(duration, 1, 0);

		duration = new Leave().computeDurationOfLeaves(new GregorianCalendar(2016, 4, 18), false,
				new GregorianCalendar(2016, 4, 20), false);
		assertEquals(duration, 3, 0);

		duration = new Leave().computeDurationOfLeaves(new GregorianCalendar(2016, 5, 13), false,
				new GregorianCalendar(2016, 5, 17), false);
		assertEquals(duration, 5, 0);

		duration = new Leave().computeDurationOfLeaves(new GregorianCalendar(2016, 5, 06), true,
				new GregorianCalendar(2016, 5, 8), false);
		assertEquals(duration, 2.5, 0);

		duration = new Leave().computeDurationOfLeaves(new GregorianCalendar(2016, 5, 06), false,
				new GregorianCalendar(2016, 5, 8), true);
		assertEquals(duration, 2.5, 0);

		duration = new Leave().computeDurationOfLeaves(new GregorianCalendar(2016, 5, 06), true,
				new GregorianCalendar(2016, 5, 8), true);
		assertEquals(duration, 2, 0);

	}

	@Test
	public void nonAlphanumericCharactersInReason() throws Exception {
		try {
			//not working yet for punctuation
			new Leave().setReason("abc");
			fail("Checker should return error message: Reason cannot contain special characters");
		} catch (InvalidInputException expected) {

		}
	}

	// @Test
	// public void onlyNumbersInReason() throws Exception {
	//
	// }
	//
	// @Test
	// public void onlyPunctuationsInReason() throws Exception {
	//
	// }
	//
	// @Test
	// public void onlySpacesInReason() throws Exception {
	//
	// }
	//
	// @Test
	// public void removeSpacesBeforeAndAfterReason() throws Exception {
	//
	// }
	//
	// @Test
	// public void noInputForReason() throws Exception {
	//
	// }
	//
	// @Test
	// public void checkIfSupervisorIsFromDifferentDepartment() throws Exception
	// {
	//
	// }
	//
	// @Test
	// public void checkIfSupervisorIsOnLeave() throws Exception {
	//
	// }
	//
	// @Test
	// public void checkIfEmployeeHasEnoughCredits() throws Exception {
	//
	// }
	//
	// @Test
	// public void extractLWOPfromFiledLeave() throws Exception {
	//
	// }
	//
	// @Test
	// public void deductELfromVL() throws Exception {
	//
	// }
	//
	// @Test
	// public void deductSPLfromVL() throws Exception {
	//
	// }
	//

}
