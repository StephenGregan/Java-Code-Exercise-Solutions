package sheet2Methods;

public class Ex5Salary {

	public static void main(String[] args) {

		Ex5Salary ex5 = new Ex5Salary();
		double salary = 30_000;
		ex5.printMonthlySalary(salary);
		ex5.salaryAfterPayRise(salary,4);
		ex5.salaryAfterPayRise(salary,6);

	}

	public void salaryAfterPayRise(double salary,double payRise){
		double result = salary + (salary * (payRise / 100));
		System.out.printf("Salary after pay rise %.2f\n", result);

	}

	public void printMonthlySalary(double yearlysalary){
		double salary = yearlysalary / 12;
		System.out.printf("The monthly salary is:  %.2f\n", salary);

	}
}
