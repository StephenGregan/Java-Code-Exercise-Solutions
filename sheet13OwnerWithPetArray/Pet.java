package sheet13OwnerWithPetArray;

/*import java.util.Arrays;*/

public abstract class Pet {

	private String name;
	private String breed;
	private int age;
	private String colour;
	private boolean isFemale;
	/*public static final boolean FEMALE;
	public static final boolean MALE;*/
	/*private String typeOfAnimal;*/
	
	public Pet() {
			
	}

	public Pet(String name, String breed, int age, String colour, boolean isFemale) {
		/*super();*/
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.colour = colour;
		this.isFemale = isFemale;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public boolean IsFemale() {
		return isFemale;
	}

	public void setIsFemale(boolean isFemale) {
		this.isFemale = isFemale;
	}
	
	public abstract String getTypeofAnimal();
	

	@Override
	public String toString() {
		String text = "\n" + getName() + "is a" +
				((IsFemale()) ? "Female" : "Male") +
				getTypeofAnimal();
		text += "The breed is " + breed;
		text += "The age is " + age;
		text += "The colour is " + colour.toString().toLowerCase();
		return text;
	}
	
	
}
