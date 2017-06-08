package sheet15Exceptions;

import javax.swing.JOptionPane;

public class Ex3MainWeekday {

	public static void main(String[] args) {
		
	try {
			Ex3Weekday w1 = new Ex3Weekday("THURSDAY");
		} catch (Ex3InvalidWeeklyException e) {
			JOptionPane.showMessageDialog(null, "Invalid day please try again");
			e.printStackTrace();
			System.exit(1);
		}finally{
			System.out.println("In the finally block");
		}
		
		try {
			Ex3Weekday w2 = new Ex3Weekday("FRIDAY");
		} catch (Ex3InvalidWeeklyException e) {
			JOptionPane.showMessageDialog(null, "Invalid day please try again");
			e.printStackTrace();
			System.exit(1);
		}finally{
			System.out.println("In the finally block");
		}
	}

}
