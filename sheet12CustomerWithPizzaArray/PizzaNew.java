package sheet12CustomerWithPizzaArray;

import java.util.Arrays;

public class PizzaNew {

	private String [] toppings;
	private PizzaSize pizzaSize;
	
	public PizzaNew(String []toppings,PizzaSize pizzaSize){
		this.toppings = toppings;
		this.pizzaSize = pizzaSize; 
		
	}

	public String[] getToppings() {
		return toppings;
	}

	public void setToppings(String[] toppings) {
		this.toppings = toppings;
	}

	public PizzaSize getPizzaSize() {
		return pizzaSize;
	}

	public void setPizzaSize(PizzaSize pizzaSize) {
		this.pizzaSize = pizzaSize;
	}
	
	public double calculatePrice(){
		
		return pizzaSize.getBasePrice()
		+ (pizzaSize.getPricePerTopping() * toppings.length);
	}

	@Override
	public String toString() {
		String text =  "Pizza toppings = ";
		for(int i = 0;i < toppings.length;i++){
			text += toppings[i];
			if(i != toppings.length - 1){
				text += ", ";
			}
			
		}
		
		text += ", pizzaSize = " + pizzaSize.toString().toLowerCase().replace('_',' ');
		text += String.format(", Price = %.2f", calculatePrice());
		return text;
	}
	
	
}
