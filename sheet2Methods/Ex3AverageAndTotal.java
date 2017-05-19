package sheet2Methods;

public class Ex3AverageAndTotal {

	public static void main(String[] args) {

		Ex3AverageAndTotal ex3 = new Ex3AverageAndTotal();
		double a = 1.2;
		double b = 2.2;
		int c = 5;
		ex3.getAverage(a,b,c);
		ex3.getTotal(a,b,9);

	}

	public void getTotal(double num1,double num2,int num3){
		double total;
		total = num1 + num2 + num3;
		System.out.println("The total is : " + total);

	}

	public void getAverage(double num1,double num2,int num3){
		double average = (num1 + num2 + num3) / 3;
		System.out.printf("The average is : %.2f\n",average);

	}
}
