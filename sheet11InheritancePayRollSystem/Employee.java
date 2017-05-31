package sheet11InheritancePayRollSystem;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public abstract class Employee {

	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	
	public Employee(){
		
		
	}
	
	public Employee(String firstName,String lastName,LocalDate dateOfBirth){
		this();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public abstract double getEarnings();

	@Override
	public String toString() {
		return "FirstName = " + firstName + "LastName = " + lastName + "DateOfBirth = " + String.format("%02d/%02d/%d",
				dateOfBirth.get(ChronoField.DAY_OF_MONTH),dateOfBirth.get(ChronoField.MONTH_OF_YEAR),dateOfBirth.get(ChronoField.YEAR));
	}
	
	
}
