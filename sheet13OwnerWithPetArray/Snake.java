package sheet13OwnerWithPetArray;

public class Snake extends Pet {

	/*private String name;
	private String breed;
	private int age;
	private String colour;*/
	private boolean isFemale;
	private String typeOfAnimal;

	public Snake() {
		
	}
	
	public Snake(String name,String breed,int age,String colour,boolean isFemale) {
		super(name,breed,age ,colour,isFemale);
		/*this.name = name;
		this.breed = breed;
		this.age = age;
		this.colour = colour;
		this.isfemale = isFemale;*/
			
	}
	
	/*public String getTypeOfAnimal() {
		
		return typeOfAnimal;
	}*/
	
	/*@Override
	public void Sleep() {
			
	}

	@Override
	public void Walk() {
			
	}*/

	@Override
	public String getTypeofAnimal() {
		// TODO Auto-generated method stub
		return "snake";
	}
	
	/*@Override
	public String toString() {
		return "Snake" + "\nName : " + getName() + "\nBreed : " + getBreed() + "\nAge : " + getAge() + "\nColour : "
				+ getColour() + "\nIs female : " + isFemale;
	}*/

}
