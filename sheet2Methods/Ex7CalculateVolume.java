package sheet2Methods;

import java.util.Scanner;

public class Ex7CalculateVolume {

	public static void main(String[] args) {

		Ex7CalculateVolume ex7 = new Ex7CalculateVolume();
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first number : ");
		double num1 = input.nextDouble();

		System.out.print("Enter the second number : ");
		double num2 = input.nextDouble();

		System.out.print("Enter the third number : ");
		double num3 = input.nextDouble();
		
		double volume = ex7.getVolume(num1,num2,num3);
		System.out.println("The volume is : " + volume);
		
		input.close();
		
	}
	
	public double getVolume(double depth,double width,double breadth){
		return depth * width * breadth;

	}
	
}
