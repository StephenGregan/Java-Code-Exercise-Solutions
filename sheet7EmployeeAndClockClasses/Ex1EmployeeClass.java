package sheet7EmployeeAndClockClasses;

public class Ex1EmployeeClass {
	
	private String name;
	private int age;
	private double salary;
	private int noOfSickDays;
	private int employeeNumber;

	public static final int numberOfEmployees = 0;
	public static int numOfEmployeeCounter;
	
	public Ex1EmployeeClass() {
		numOfEmployeeCounter++;
	}
	
	public Ex1EmployeeClass(String name,int age,double salary,
							int noOfSickDays,int employee_number) {
		this();
		setName(name);
		setAge(age);
		setSalary(salary);
		setNoOfSickDays(noOfSickDays);
		setEmployeeNumber(employeeNumber);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		switch(name){
		case "Pat Jones":
		case "Phil Apple":
		case "Bob Michaels":
		case "Stephen Kelly":
		case "Vincent McMahon":
		case "Damien Keily":
			this.name = name;
			break;
			default:
				System.out.println("Invalid name " + name);
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age >= 18 || age <= 65) {
			this.age = age;	
		}else{
			System.out.println("Invalid age " + age);	
		}
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public int getNo_of_sick_days() {
		return noOfSickDays;
	}
	
	public void setNoOfSickDays(int noOfSickDays) {
		if(noOfSickDays >= 0 || noOfSickDays >= 10) {
		this.noOfSickDays = noOfSickDays;
		}else {
			System.out.println("Too many sick days, first verbal warning ");
		}
	}
	
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	
	public void setEmployeeNumber(int employeeNumber) {
		switch(employeeNumber) {
		case 1000:
		case 1001:
		case 1002:
		case 1003:
		case 1004:
		case 1005:
		case 1006:
		case 1007:
		case 1008:
		case 1009:
		case 1010:
		this.employeeNumber = employeeNumber;
		break;
		default:
			System.out.println(employeeNumber + "Invalid employee number");	
		}
	}
	
	public double salaryIncrease() {

		return 0;
	}
	
	@Override
	public String toString() {
		return "\nName " + name + "\nAge " + age + "\nSalary" + salary + "\nNumber of sick days " + noOfSickDays +
				"\nEmployee number " + employeeNumber;
	
	}
}
