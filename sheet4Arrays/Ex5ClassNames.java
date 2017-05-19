package sheet4Arrays;

public class Ex5ClassNames {

	public static void main(String[] args) {


		String [] firstName = {"Emmanuel","Pat","Sean","Stephen","Assen","Ben","Agnus"};
		String [] lastName = {"Llyod","Gregan","lowrey","Flynn","Dowling","Wrench","Fallon"};
		String [] fullName = new String  [lastName.length] ;


		//	public void firstName(String [] firstName){	}
		for(int i = 0;i < fullName.length;i++){
			fullName [i] = firstName[i] + " " + lastName[i];
			System.out.println("Full name is : " + fullName[i]);
		}
		for(int i = 0;i < firstName.length;i++){
			System.out.println("First name is : " + firstName[i]);
		}
		for(int i = 0;i < lastName.length;i++){
			System.out.println("Last name is : " + lastName[i]);
		}

	}	

}
