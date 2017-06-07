package sheet13OwnerWithPetArray;

public class Cat extends Pet implements Mammel {
	
	private String name;
	private String breed;
	private int age;
	private String colour;
	private boolean isFemale;
	private int numOfLives = 9;
	private String microchipNumber;
	private boolean isNeutered;
	private String typeOfAnimal;
	
	public Cat() {
			
	}
	
	public Cat (String name,String breed,int age,String colour,boolean isFemale) {
		super(name,breed,age ,colour,isFemale);
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.colour = colour;
		this.isFemale = isFemale;
		
			
	}

	public Cat (String name,String breed,int age,String colour,boolean isFemale,int noOfLives) {
		super(name,breed,age,colour,isFemale);
		/*this.name = name;
		this.breed = breed;
		this.age = age;
		this.colour = colour;
		this.isfemale = isFemale;*/
		this.numOfLives = noOfLives;
			
	}

	public int getNumOfLives() {
		return numOfLives;
	}

	public void setNumOfLives(int numOfLives) {
		this.numOfLives = numOfLives;
	}
	
	public void setJustlostALife() {
		numOfLives--;
	}
	
	public String getTypeOfAnimal() {
		
		return typeOfAnimal;
	}
	
	
	
	public String getMicrochipNumber() {
		return microchipNumber;
	}

	public void setMicrochipNumber(String microchipNumber) {
		this.microchipNumber = microchipNumber;
	}

	public boolean isNeutered() {
		return isNeutered;
	}

	public void setNeutered(boolean isNeutered) {
		this.isNeutered = isNeutered;
	}

	@Override
	public void Sleep() {
			
	}

	@Override
	public void Walk() {
			
	}
	
	@Override
	public String getTypeofAnimal() {
		
		return "Cat";
	}

	@Override
	public String toString() {
		return super.toString() + "\nMicrochip number" + microchipNumber +
				"\nNumber of lives" + numOfLives + String.format("\nThe cat %s neutered",
						(isNeutered) ? "is" : "is not");
	}

	
}
