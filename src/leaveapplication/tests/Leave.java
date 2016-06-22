package leaveapplication.tests;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Leave {

	private GregorianCalendar startDate;
	private GregorianCalendar endDate;
	private String reason;

	public void setSchedule(GregorianCalendar start, GregorianCalendar end) throws InvalidInputException {
		checkIfEndDateIsEarlier(start, end);
		this.startDate = start;
		this.endDate = end;

	}
	
	public void setReason(String reason) throws InvalidInputException{
		checkIfReasonIsValid(reason);
		this.reason = reason;
	}

	private void checkIfReasonIsValid(String reason) throws InvalidInputException {
		Pattern p = Pattern.compile("[^A-Za-z0-9 ]\\p{Graph}", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(reason);
		if(!m.find())
			throw new InvalidInputException("Text should not contain any numbers or special characters");		
	}

	private void checkIfEndDateIsEarlier(GregorianCalendar start, GregorianCalendar end) throws InvalidInputException {
		if (end.before(start))
			throw new InvalidInputException("The end date cannot be earlier that the start date");
	}
	
	public double computeDurationOfLeaves(GregorianCalendar start, boolean startIsHalfDay, GregorianCalendar end, boolean endIsHalfDay) {
		// TODO Auto-generated method stub
		double duration = 0;
		Date d1 = start.getTime();
		Date d2 = end.getTime();
		if (start.equals(end))
			duration = 1;
		else
			duration = (d2.getTime()-d1.getTime())/ (1000 * 60 * 60 * 24)+1;
		
		if (startIsHalfDay)
			duration-=0.5;
		if (endIsHalfDay)
			duration-=0.5;
		
		return duration;
	}
	
}