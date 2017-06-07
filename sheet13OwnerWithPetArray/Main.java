package sheet13OwnerWithPetArray;

public class Main {

	public static void main(String[] args) {

		/*	for(int i = 0; i < pets.length;i++){
			System.out.println(pets);

			Snake s1 = new Snake("Bobby The Snake","Python",5,"Black",true);
			System.out.println(s1);
			Cat c1 = new Cat("Bob The Cat","Black Cat",7,"White",false);
			System.out.println(c1);
			Dog d1 = new Dog("Jack The Dog","Puddle",3,"Black/White",true,true);
			System.out.println(d1);
			Hamster h1 = new Hamster("Buster The Hamster","Hamster",8,"Golden",false);
			System.out.println(h1);

		}
		 */
		Owner o1 = new Owner("Jamie Smith","Dublin","545746570",
				new Pet [] { new Dog("Lady","Staff",1,"Blue",true,"123456"),
						new Snake("Tim","Python",5,"Black",true),
						new Hamster("Ham","Dwarf",4,"Pink",false)});

		System.out.println(o1);

		for(Pet p : o1.getPets()){
			if(p instanceof Mammel){
				((Mammel)p).Walk();

			}

		}
		
	}
	
}




