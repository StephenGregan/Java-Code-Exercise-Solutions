package sheet11InheritancePayRollSystem;

import java.time.LocalDate;

public final class Boss extends Employee {

	private double weeklySalary;
	
	
	public Boss() {
		
		
	}
	
	public Boss(String firstName,String lastName,LocalDate dateOfBirth,double weeklySalary) {
	super(firstName,lastName,dateOfBirth);
	this.weeklySalary = weeklySalary;
		
	}
	
	public void setWeeklySalary() {
		
		
	}
	
	public double getWeeklySalary() {
		return weeklySalary;
	}

	/*public double getEarnings() {
		
		return getEarnings();
	}*/

	@Override
	public String toString() {
		return super.toString() + String.format("\nThe weekly salary is = €%.2f \n", getWeeklySalary());
	}

	@Override
	public double getEarnings() {
		
		return weeklySalary;
	}
	
	
}
