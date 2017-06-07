package sheet13OwnerWithPetArray;

public class Hamster extends Pet implements Mammel {
	
	/*private String name;
	private String breed;
	private int age;
	private String colour;*/
	private boolean isFemale;
	private String typeOfAnimal;

	public Hamster() {
		
	}

	public Hamster(String name, String breed, int age, String colour, boolean isFemale) {
		super(name,breed,age,colour,isFemale);
		/*this.name = name;
		this.breed = breed;
		this.age = age;
		this.colour = colour;
		this.isfemale = isfemale;*/
	}
	
	public String getTypeofAnimal() {
		
		return "Hamster";
	}
	
	@Override
	public void Sleep() {
		System.out.println(getName() + "Is going for a walk");
		
	}

	@Override
	public void Walk() {
		System.out.println(getName() + "Is going to sleep");
		
	}

	/*@Override
	public String toString() {
		return "\nHamster" + "\nName : " + getName() + "\nBreed : " + getBreed() + "\nAge : " + getAge() + "\nColour : " 
				+ getColour() + "\nIs female : " + isFemale;
	}*/
	
}
