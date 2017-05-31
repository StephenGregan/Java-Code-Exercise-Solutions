package sheet11InheritancePayRollSystem;

import java.time.LocalDate;

public final class HourlyWorker extends Employee{

	private double wage;
	private int hoursWorked;
	private double earnings;
	
	public HourlyWorker(){
		
		
	}
	
	public HourlyWorker(String firstName,String lastName,LocalDate dateOfBirth,double wage,int hoursWorked){
		super(firstName,lastName,dateOfBirth);
		this.wage = wage;
		this.hoursWorked = hoursWorked;
		
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
public double getEarnings() {
		earnings = wage * hoursWorked;
		return earnings;
	}

@Override
public String toString() {
	return super.toString() + String.format("\nHourly worker earnings are %.2f\n",getEarnings());
}

	
}
