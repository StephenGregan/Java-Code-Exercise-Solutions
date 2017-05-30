package sheet11InheritancePayRollSystem;

public final class CommisionWorker {

		private double salary;
		private double commission;
		private int quantity;
		
		public  CommisionWorker(){
			
			
		}
		
		public CommisionWorker(double salary,double commission,int quantity){

			
		
		
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
		
		public double getEarnings(){
			
			return 0;
		}

		@Override
		public String toString() {
			return "CommisionWorker [salary=" + salary + ", commission=" + commission + ", quantity=" + quantity + "]";
		}
		
		
}
