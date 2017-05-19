package sheet4Arrays;

public class Ex4ArrayOfPrices {

	public static void main(String[] args) {

		double [] prices = {12.60,13.40,56.78,99.01,32.45,16.85,25.76,35.88,55.55,12.27,14.67,13.90};
		double []  newPrices = new double[prices.length];
		
		for(int i = 0;i < prices.length;i++){
			newPrices[i] = prices[i] * 1.04;

		}
		System.out.printf("%-10s%10s\n","Old Price","New Price");
		for(int i =0; i < prices.length;i++){
			System.out.printf("%-10.2f %-10.2f\n",prices[i],newPrices[i]);

		}

		Ex3SumOfTwoArrays ex3 = new Ex3SumOfTwoArrays();
		ex3.printMyArray(prices);
		ex3.printMyArray(newPrices);
	}

}
