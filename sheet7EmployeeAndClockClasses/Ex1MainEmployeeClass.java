package sheet7EmployeeAndClockClasses;

//import java.util.Scanner;
//import sheet7EmployeeAndClockClasses.Ex1EmployeeClass;

public class Ex1MainEmployeeClass {

	public static void main(String[] args) {
	
		/*Scanner input = new Scanner(System.in);
		Ex1EmployeeClass Ex1EmployeeClassObject = new Ex1EmployeeClass();
*/
		Ex1EmployeeClass pp = new Ex1EmployeeClass();
		pp.setName("Pat Jones");
		pp.setAge(50);
		pp.setNoOfSickDays(9);
		pp.setSalary(90000);
		
		Ex1EmployeeClass pp1 = new Ex1EmployeeClass();
		pp1.setName("Bob Michaels");
		pp1.setAge(35);
		pp1.setNoOfSickDays(3);
		pp1.setSalary(40000);
		
		Ex1EmployeeClass pp2 = new Ex1EmployeeClass();
		pp2.setName("Stephen Kelly");
		pp2.setAge(32);
		pp2.setNoOfSickDays(5);
		pp2.setSalary(10000);
		
		Ex1EmployeeClass pp3 = new Ex1EmployeeClass("Vincent McMahon", 30,5,30000);
		
		
		
		
		
		
		
		System.out.println(pp);
		System.out.println(pp1);
		System.out.println(pp2);
		System.out.println(pp3);
	}

}
