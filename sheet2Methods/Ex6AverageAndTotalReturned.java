package sheet2Methods;

public class Ex6AverageAndTotalReturned {

	public static void main(String[] args) {

		Ex6AverageAndTotalReturned ex6 = new Ex6AverageAndTotalReturned();
		double result = ex6.getAverage(2.2,4.4,6);
		System.out.println("The average is : " + result);
		result = ex6.getTotal(2.2,4.4,6);
		System.out.println("The total is : " + result);

	}

	public double getTotal(double num1, double num2,int num3){
		double total = num1 + num2 + num3;
		return total;

	}

	public double getAverage(double num1, double num2,int num3){
		double average = (num1 + num2 + num3) / 3;
		return average;
	}
}
