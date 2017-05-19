package sheet5PracticeCreatingClasses;

public class Ex1MainCar {

	public static void main(String[] args) {
		
		Ex1Car c1 = new Ex1Car();
		
		c1.setMake("Ford");
		c1.setModel("Focus");
		c1.setEngineSize(1.4);
		
		System.out.println("Make : " + c1.getMake());
		System.out.println("Model : " + c1.getModel());
		System.out.println("Engine Size : " + c1.getEngineSize());
		
		System.out.println("---------------------------");
		
		Ex1Car c2 = new Ex1Car("Audi","A4", 2.0);
		System.out.println(c2);
		
		System.out.println("Number of car objects created" + Ex1Car.carCounter);

	}

}
