package sheet1VariableOperators;

public class Ex4Average {

	public static void main(String[] args) {
		// All double DataTypes
		double num1 = 2.25;
		double num2 = 4.77;
		double num3 = 17.35;
		// Prints out with two decimals places .2f gives answer 24.37.
		System.out.printf("The total is : %.2f\n",num1 + num2 + num3);
		// Adds nums1,num2,num3 and then divides them by 3. If you want to add the numbers together first you need ()round brackets.
		System.out.println("The average is : " + (num1 + num2 + num3) / 3);

	} // End of main

} // End of class
