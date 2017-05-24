package sheet2Methods;

public class Ex8SalaryWithReturns {

	public static void main(String[] args) {

		Ex8SalaryWithReturns ex8 = new Ex8SalaryWithReturns();
		//double salary;
		//ex8.printMonthlySalary();
		//ex8.salaryAfterPayRise(salary, 4);
		//ex8.salaryAfterPayRise(salary, 6);
		double salary = 30_000;

		double monthly = ex8.printMonthlySalary(salary);
		System.out.printf("The monthly salary is %.2f\n : ", monthly);

		//Object weekly;
		//ex8.printWeeklysalary(salary);
		System.out.printf("The weekly slary is % .2f\n : ",ex8.printWeeklySalary(salary));

		double newSalary = ex8.salaryAfterPayRise(salary,4);
		System.out.printf("The new salary after  4%% payrise %.2f\n ",newSalary);

		newSalary = ex8.salaryAfterPayRise(salary,6);
		System.out.printf("The new salary after  6%% payrise %.2f\n ",newSalary);

	}

	public void printHello(){
		System.out.println("Hello");

	}

	public double salaryAfterPayRise(double salary,double payRise){
		double result = salary + (salary * (payRise / 100));
		return result;

	}

	public double printMonthlySalary(double yearlySalary){
		double salary = yearlySalary / 12;
		return salary;

	}

	public double printWeeklySalary(double yearlySalary){
		double salary = yearlySalary / 52;
		return salary;
	}

}
