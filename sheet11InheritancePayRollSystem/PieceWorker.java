package sheet11InheritancePayRollSystem;

import java.time.LocalDate;

public final class PieceWorker extends Employee {

	private double wagePerPiece;
	/*private int quantity;*/
	private double earnings;
	private double overtime = 1.5;
	private int hoursWorked = 42;
	
	
	public PieceWorker() {
		
		
	}
	
	public PieceWorker(String firstName,String lastName,LocalDate dateOfBirth,double wagePerPrice,int hoursWorked) {
		super(firstName,lastName,dateOfBirth);
		this.hoursWorked = hoursWorked;
		this.wagePerPiece = wagePerPrice;
		
	}

	/*public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getWagePerPiece() {
		return wagePerPiece;
	}

	public void setWagePerPiece(double wagePerPiece) {
		this.wagePerPiece = wagePerPiece;
	}*/
	
	public double getWagePerPiece() {
		return wagePerPiece;
	}

	public void setWagePerPiece(double wagePerPiece) {
		this.wagePerPiece = wagePerPiece;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getEarnings() {
		if(hoursWorked > 40){
			earnings = overtime * wagePerPiece;
		}
		return earnings;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("\nPiece workers earnings are = €%.2f\n",getEarnings());
	}
	
	
}
