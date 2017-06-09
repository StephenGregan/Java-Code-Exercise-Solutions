package sheet15Exceptions;

//import java.util.Scanner;
////mport sheet7EmployeeAndClockClasses.Ex1EmployeeClass;

public class Ex1MainEmployeeClass {

	public static void main(String[] args) {
	
		/*Scanner input = new Scanner(System.in);
		Ex1EmployeeClass Ex1EmployeeClassObject = new Ex1EmployeeClass();
*/
		
		
		////(String name,int age,double salary,	int noOfSickDays)
	
		Ex1EmployeeClass pp;
		try {
			pp = new Ex1EmployeeClass("Pat Jones",75,22000,10);
	
		System.out.println(pp);
		
		} catch (Ex1InvalidAgeException e) {
			e.printStackTrace();
		}
		/*pp.setName("Pat Jones");
		try {
			pp.setAge(70);
		} catch (Ex1InvalidAgeException e) {
			e.printStackTrace();
		}
		pp.setNoOfSickDays(9);
		pp.setSalary(90000);
		*/
		
/*		Ex1EmployeeClass pp1 = new Ex1EmployeeClass();
		pp1.setName("Bob Michaels");
		try {
			pp1.setAge(77);
		} catch (Ex1InvalidAgeException e) {
			e.printStackTrace();
		}
		pp1.setNoOfSickDays(3);
		pp1.setSalary(40000);
		
		Ex1EmployeeClass pp2 = new Ex1EmployeeClass();
		pp2.setName("Stephen Kelly");
		try {
			pp2.setAge(32);
		} catch (Ex1InvalidAgeException e) {
			e.printStackTrace();
		}
		pp2.setNoOfSickDays(5);
		pp2.setSalary(10000);
		
		Ex1EmployeeClass pp3 = null;
		try {
			pp3 = new Ex1EmployeeClass("Vincent McMahon", 30,5,30000);
		} catch (Ex1InvalidAgeException e) {
			e.printStackTrace();
		}
		
		System.out.println(pp);
		System.out.println(pp1);
		System.out.println(pp2);
		System.out.println(pp3);*/
	}

}
