package sheet5PracticeCreatingClasses;

public class Ex2Dogs {

	private String breed;
	private String colour;
	private String ownersName;

	public static int dogCounter;

	public Ex2Dogs(){
		dogCounter++;

	}

	public Ex2Dogs(String breed, String colour, String ownersName){
		this();
		this.breed = breed;
		this.colour = colour;
		this.ownersName = ownersName;

	}

	public void setBreed(String breed){
		this.breed = breed;

	}

	public void setColour(String colour){
		this.colour = colour;

	}

	public void setOwnersName(String ownersName){
		this.ownersName = ownersName;

	}

	public String getBreed(){
		return breed;

	}

	public String getColour(){
		return colour;

	}

	public String getOwnersName(){
		return ownersName;

	}

	public String toString(){
		return "\n\nBreed: " + breed + "\n\nColour : " + colour + "\n\nOwnersName : " + ownersName;

	}

}
