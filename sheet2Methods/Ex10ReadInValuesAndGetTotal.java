package sheet2Methods;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ex10ReadInValuesAndGetTotal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		double num1 = input.nextDouble();
		
		String s = JOptionPane.showInputDialog("Please enter the second number: ");
		double num2 = Double.parseDouble(s);
		
		System.out.print("Please enter the third number: ");
		double num3 = input.nextDouble();
		
		double total = getTotal(num1,num2,num3);
		System.out.println("The total is: " + total);
	}
	public static double getTotal(double num1,double num2,double num3){
		double result = num1 + num2 + num3;
		return result;
		
	}
}
