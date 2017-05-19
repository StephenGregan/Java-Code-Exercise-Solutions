package sheet5PracticeCreatingClasses;

public class Ex2Dogs {

	private int breed;
	private String colour;
	private String ownersName;

	public static int dogCounter;
	
	public static final int HUSKY = 0;
	public static final int BOXER = 1;
	public static final int COLLIE = 2;
	public static final int ALSATION = 3;
	public static final int GERMAN_SHEPARD = 4;
	
	public Ex2Dogs(){
		dogCounter++;

	}

	public Ex2Dogs(int breed, String colour, String ownersName){
		this();
		//this.breed = breed;
		setBreed(breed);
		this.colour = colour;
		this.ownersName = ownersName;

	}

	public void setBreed(int breed){
		if(breed <= 0 && breed <= 5){
			this.breed = breed;	
		}else{
System.out.println("Invalid breed");
			
		}

	}

	public void setColour(String colour){
		this.colour = colour;

	}

	public void setOwnersName(String ownersName){
		this.ownersName = ownersName;

	}

	public int getBreed(){
		return breed;

	}

	public String getColour(){
		return colour;

	}

	public String getOwnersName(){
		return ownersName;

	}
	
	public String getBreedAsString(){
		switch(breed){
		case HUSKY:
			return "Husky";
		case BOXER:
			return "Boxer";
		case COLLIE:
			return "Collie";
		case ALSATION:
			return "Alsation";
		case GERMAN_SHEPARD:
			return "German Shepard";
			default:
				return "Breed not set";
		}
		}
		

	public String toString(){
		return "\n\nBreed: " + getBreedAsString() + "\n\nColour : " + colour + "\n\nOwnersName : " + ownersName;

	}

}
