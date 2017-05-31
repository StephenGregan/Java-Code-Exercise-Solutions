package sheet11InheritancePayRollSystem;

import java.time.LocalDate;

public final class CommisionWorker extends Employee {

		private double salary ;
		private double commission ;
		private int quantity;
		
		public  CommisionWorker(){
			
			
		}
		
		public CommisionWorker(String firstName,String lastName,LocalDate dateOfBirth,double salary,double commission,int quantity){
			super(firstName,lastName,dateOfBirth);
			this.salary = salary;
			this.commission = commission;
			this.quantity = quantity;
			
		
		
	}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public double getCommission() {
			return commission;
		}

		public void setCommission(double commission) {
			this.commission = commission;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		
		public void setEarnings(double salary){
			this.salary = salary;
			
		}
		
		public double getEarnings(){
			salary = salary + commission * quantity;
			return salary;
		}

		@Override
		public String toString() {
			return super.toString() + String.format("\nCommission worker earns : %.2f\n",getEarnings());
		}

	/*@Override
	public void getEarnings() {
		// TODO Auto-generated method stub
		
	}*/
		
		
}
