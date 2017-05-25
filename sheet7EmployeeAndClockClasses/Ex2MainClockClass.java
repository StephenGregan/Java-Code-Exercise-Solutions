package sheet7EmployeeAndClockClasses;

public class Ex2MainClockClass {

	public static void main(String[] args) {
		
		Ex2ClockClass c1 = new Ex2ClockClass(11, 30, 0);
		System.out.println(c1);
		c1.incrementHours(3);
		System.out.println(c1);
		c1.incrementMinutes(50);
		System.out.println(c1);
		c1.incrementSeconds(50);
		System.out.println(c1);
		c1.incrementSeconds(15);
		System.out.println(c1);
		c1.reset();
		System.out.println(c1);
	}
}
