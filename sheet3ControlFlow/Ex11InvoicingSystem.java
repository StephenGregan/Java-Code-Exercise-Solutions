package sheet3ControlFlow;

public class Ex11InvoicingSystem {

	public static void main(String[] args) {
		
		String refNum = "123ABC";
		double price = 1;
		int quantity = 100;
		Ex11InvoicingSystem ex11 = new Ex11InvoicingSystem();
		ex11.calculateTotal(refNum, price, quantity);
		
	}

	public void calculateTotal(String refNum,double price, int quantity){
		
		int remainder;
		double totalCost;
		
		if(quantity > 100){
			remainder = quantity - 100;
		totalCost = 100 * price + remainder * price * 0.75;	
		}else{
			totalCost = quantity * price;
	
		}
		
		System.out.printf("Reference number: %s, \n" + "quantity: %d * price: �%.2f = %.2f",refNum,quantity,price,totalCost);
		
	}
}
