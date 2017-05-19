package sheet5PracticeCreatingClasses;

public class Ex1Car {

	private String make;
	private String model;
	private  double engineSize;

	public static int carCounter;

	public  Ex1Car(){
		carCounter++;

	}

	public  Ex1Car(String make, String model, double engineSize){
		this();
		setMake(make);
		this.model = model;
		setEngineSize(engineSize);

	}
	
	public void setMake(String make){
		switch(make){
		case "Honda":
		case "Ford":
		case "BMW":
		case "Opel":
		case "Volswagen":
		case "Mercedes":
		case "Alpha Romeo":
		case "Mitsubishi":
		case "Audi":
		case "Toyota":
			this.make = make;
			break;
		default:
			System.out.println(make + "is not valid");
		}

	}
	public void setModel(String model){
		this.model = model;

	}
	public void setEngineSize(double size){
		if(size >= 1 && size <= 2.3){
			this.engineSize = size;
		}else{
			System.out.println(size + "is not a valid engine size");

		}

	}

	public String getMake(){
		return make;

	}

	public String getModel(){
		return model;

	}
	public double getEngineSize(){
		return engineSize;

	}

	public String toString(){
		return "\n\nMake" + make + "\n\nModel" + model + "\n\nEngine Size" + engineSize; 

	}
	
}
