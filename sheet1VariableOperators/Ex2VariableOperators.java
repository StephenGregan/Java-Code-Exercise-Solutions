package sheet1VariableOperators;

public class Ex2VariableOperators {

	public static void main(String[] args) {
		// DataType short : twos complement integer,16 bits.
		short num1 = 22;
		// DataType float : IEEE 754 floating point, 32 bits.
		float num2 = 3.6f;
		// DataType double : IEEE 754 floating point, 64 bits.
		double num3 = 15.99;
		// DataType int : twos complement integer, 32 bits.
		int num4 = 47;
		// Results in sum(total) with the DataType double.
		double sum = num1 + num2 + num3 + num4;
		// Declares product with the DataType double.
		double product;
		// product sum.
		product = num1 * num2 * num3 * num4;
		// Prints out String "" + sum + "" + product.
		System.out.println("The sum is : " + sum + "\nThe product is : " + product);
		// Prints out using printf(formatting).
		System.out.printf("The sum is : %.2f and the product is : %.2f",sum,product);

	} // End of Main

} // End of Class
