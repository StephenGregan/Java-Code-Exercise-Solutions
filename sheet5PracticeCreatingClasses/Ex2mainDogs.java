package sheet5PracticeCreatingClasses;

public class Ex2mainDogs {

	public static void main(String[] args) {

		Ex2Dogs d1 = new Ex2Dogs();

		d1.setBreed("Staff");
		d1.setColour("Black");
		d1.setOwnersName("John");

		System.out.println("Breed : " + d1.getBreed());
		System.out.println("Colour : " + d1.getColour());
		System.out.println("Owners Name : " + d1.getOwnersName());

		System.out.println("-----------------");

		Ex2Dogs d2 = new Ex2Dogs("Bulldog","Red","Bob");
		System.out.println(d2);

		System.out.println("Numbers of dog objects created" + Ex2Dogs.dogCounter);

	}

}
