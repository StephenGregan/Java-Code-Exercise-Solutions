package sheet12CustomerWithPizzaArray;

import java.util.ArrayList;


public class MainNew {

	public static void main(String[] args) {
		
		PizzaSize ps1 = PizzaSize.LARGE;
		
		String [] toppings = {"Cheese","Tomato"};
		
		PizzaNew p1 = new PizzaNew(toppings,ps1);
		
		PizzaNew p2 = new PizzaNew(new String [] {"Cheese","Tomato","Ham"},PizzaSize.LARGE);
		
		PizzaNew [] pizzas = {p1,p2};
		
		ArrayList<PizzaNew> pizzaList = new ArrayList<>();
		pizzaList.add(p1);
		pizzaList.add(p2);
		
		for(PizzaNew one : pizzaList){
			System.out.println(one);
			
		}
		
		CustomerNew c1 = new CustomerNew("Frank Ocean","1 Main Road,Dublin","8334598",new PizzaNew [] {p1,p2,new PizzaNew(new String [] {"Extra Cheese","Peperoni"},
				PizzaSize.SMALL)});
			System.out.println(c1);

		}
	}


