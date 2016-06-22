package leaveapplication.tests;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private GregorianCalendar employmentDate;
	private float slCredits;
	private float vlCredits;
	
	public void setFirstName(String firstName) throws InvalidInputException {
		checkIfNameContainsNumbers(firstName);
		this.firstName = firstName;
	}

	public void setLastName(String lastName) throws InvalidInputException {
		checkIfNameContainsNumbers(lastName);
		this.lastName = lastName;		
	}

	private void checkIfNameContainsNumbers(String name) throws InvalidInputException {
		Pattern p = Pattern.compile("[^a-z ]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(name);
		if(m.find())
			throw new InvalidInputException("Names should not contain any numbers or special characters");
	}

	public void setPhoneNumber(String phoneNumber) throws InvalidInputException {
		checkIfPhoneNumberContainsNonnumericCharacters(phoneNumber);
		checkIfPhoneNumberContainsTenDigits(phoneNumber);
		this.phoneNumber = phoneNumber;
	}

	private void checkIfPhoneNumberContainsTenDigits(String phoneNumber) throws InvalidInputException {
		if(phoneNumber.length() != 10)
			throw new InvalidInputException("Phone number should contain ten digits.");
	}

	private void checkIfPhoneNumberContainsNonnumericCharacters(String phoneNumber) throws InvalidInputException {
		Pattern p = Pattern.compile("[^0-9 ]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(phoneNumber);
		if(m.find())
			throw new InvalidInputException("Phone number should not contain any non-numeric characters");
	}

	public void setEmploymentDate(GregorianCalendar date) throws InvalidInputException{
		checkIfFutureDate(date);
		this.employmentDate = date;
	}

	private void checkIfFutureDate(GregorianCalendar date) throws InvalidInputException {
		Calendar cal = Calendar.getInstance();
		if(cal.getTimeInMillis() < date.getTimeInMillis())
			throw new InvalidInputException("That is a future date!");
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public GregorianCalendar getEmploymentDate() {
		return employmentDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public float getSLCredits() {
		return slCredits;
	}

	public void gainSLCredits() {
		slCredits += 1.25;
	}
	
	public float getVLCredits() {
		return vlCredits;
	}

	public void gainVLCredits() {
		vlCredits += 1.25;
	}
}
