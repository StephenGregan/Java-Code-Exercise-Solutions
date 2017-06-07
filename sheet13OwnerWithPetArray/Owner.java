package sheet13OwnerWithPetArray;

import java.util.Arrays;

public class Owner {

	private String name;
	private String address;
	private String phone;
	private Pet[] pets;
	
	/*public static String [] pets = {"Bobby The Snake","Bob The Cat","Jack The Dog","Buster The Hamster"};*/
	
	public Owner() {
		
		
	}
	
	public Owner(String name, String address, String phone, Pet [] pets) {
		setName(name);
		setAddress(address);
		setPhone(phone);
		setPets(pets);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Pet [] getPets() {
		return pets;
	}

	public void setPets(Pet [] pets) {
		this.pets = pets;
	}

	@Override
	public String toString() {
		String s = "\nName is " + getName() + "\nAddress is " + getAddress()
		+ "\nPhone number is" + getPhone();
		s += "\nThe owners  pets \n";
		for(Pet p : pets){
			s += p.toString() + "\n";
			
		}
		return s;
	}
		
}
