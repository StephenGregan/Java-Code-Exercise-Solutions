package sheet12CustomerWithPizzaArray;


public class CustomerNew {

	private String name;
	private String address;
	private String phoneNumber;
	private PizzaNew [] pizzas;

	public CustomerNew(String name, String address, String phoneNumber, PizzaNew[] pizzas) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.pizzas = pizzas;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public PizzaNew[] getPizzas() {
		return pizzas;
	}

	public void setPizzas(PizzaNew [] pizzas) {
		this.pizzas = pizzas;
	}

	public double getTotalCost(){

		double cost = 0;

		for(PizzaNew one : pizzas){
			cost += one.calculatePrice();

		}
		return cost;
	}

	@Override
	public String toString() {
		String text = "Name : " + name;
		text += "Address : " + address;
		text += "Phone number : " + phoneNumber;

		for(int i = 0;i < pizzas.length;i++){
			text += "\n" + (i + 1) + ": " + pizzas[i];
			if(1 != pizzas.length - 1){
				text += ", ";
			}
			
		}
		
		text += String.format("\nTotal cost : .2f ", getTotalCost());
		return text;
		
	}
	
}
