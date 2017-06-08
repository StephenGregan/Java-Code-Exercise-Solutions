package sheet15Exceptions;

import javax.swing.JOptionPane;

public class Ex2MainClockClass {

	public static void main(String[] args) {
		
		Ex2ClockClass c1;
		try {
			c1 = new Ex2ClockClass(23, 50, 99);
		} catch (Ex2InvalidTimeException e) {
			JOptionPane.showInternalMessageDialog(null,"Invalid please try again");
			e.printStackTrace();
			System.exit(1);
		}finally{
			System.out.println("In the finally block");
			
		}
	/*	System.out.println(c1);
		c1.incrementHours(3);
		System.out.println(c1);
		c1.incrementMinutes(50);
		System.out.println(c1);
		c1.incrementSeconds(50);
		System.out.println(c1);
		c1.incrementSeconds(15);
		System.out.println(c1);
		c1.reset();
		System.out.println(c1);*/
	}
}
