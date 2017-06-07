package sheet13OwnerWithPetArray;

public class Dog extends Pet implements Mammel {

	private String microChipNumber = "Not yet set";
	private boolean isMicroChipped;
	/*private boolean Is_Micro_Chipped;
	private boolean Is_Not_Micro_Chipped;
*/	/*private String name;
	private String breed;
	private int age;
	private String colour;
	private boolean isFemale;
	private String typeOfAnimal;*/
	public static final boolean Is_Micro_Chipped = true;
	public static final boolean Is_Not_Micro_Chipped = false;
	
	public Dog() {
		

	}

	public Dog(String name,String breed,int age,String colour,boolean isFemale,String microchipNumber){
		super(name,breed,age,colour,isFemale);
		/*this.name = name;
		this.breed = breed;
		this.age = age;
		this.colour = colour;
		this.isFemale = isFemale;*/
		/*this.isMicroChipped = true;*/
		setMicroChipNumber(microchipNumber);

	}

	/*public Dog(String name,String breed,int age,String colour,boolean isFemale,boolean isMicroChipped,String microChipNumber){
		super(name,breed,age,colour,isFemale);
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.colour = colour;
		this.isFemale = isFemale;
		this.isMicroChipped = isMicroChipped;
		this.microChipNumber = microChipNumber;

	}*/

	public String getMicroChipNumber() {
		return microChipNumber;
	}

	public void setMicroChipNumber(String microChipNumber) {
		this.isMicroChipped = true;
		this.microChipNumber = microChipNumber;
	}

	public boolean isMicroChipped() {
		return isMicroChipped;
	}

	public void setMicroChipped(boolean isMicroChipped) {
		this.isMicroChipped = isMicroChipped;
	}

	public String getTypeOfAnimal(){

		return "Dog";
	}
	
	@Override
	public void Sleep() {
		System.out.println(getName() + " is going walking");
	}

	@Override
	public void Walk() {
		System.out.println(getName() + " is sleeping");
	}


	@Override
	public String getTypeofAnimal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return super.toString() + ((isMicroChipped) ? "The microchip number is" + microChipNumber :
			"The dog is not microchipped");
	}
	
}
