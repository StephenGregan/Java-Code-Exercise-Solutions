package sheet1VariableOperators;
// Imports everything (*) from the java lang package 
//import java.lang.*;
import javax.swing.JOptionPane;

public class Ex3Salary {

	public static void main(String[] args) {
		// All represent DataType double.
		double salary = 30_000;
		double weeklySalary = salary / 52;
		double total;
		double newSalary = salary * 1.08;
		// Sum for total.
		total = salary * 5;

		System.out.println("Monthly salary: " + salary / 12);
		System.out.printf("Weekly salary :  %.2f\n",weeklySalary);
		System.out.printf("The total in 5 years : %.2f\n",total);
		System.out.printf("The new salary after a 8%% pay rise is : %.2f",newSalary);
		// Gives a popup message with 30000 in the message.
		JOptionPane.showMessageDialog(null,String.format("%.2f", salary));

	} // End of Main

} // End of Class
