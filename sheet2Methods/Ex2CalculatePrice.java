package sheet2Methods;

public class Ex2CalculatePrice {

	public static void main(String[] args) {

		double price = 2.99;
		int quantity = 5;

		Ex2CalculatePrice ex2 = new Ex2CalculatePrice();
		ex2.calculatePrice(price,quantity);

	}

	public void calculatePrice(double price,int quantity){
		double total;
		total = price * quantity;
		System.out.printf("The total of %.2f times %d is %2.f",price,quantity,total);

	}

}
