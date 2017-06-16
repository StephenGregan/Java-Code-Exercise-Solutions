package sheet16StringsAndStringBuilder;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex6RandomWords {

	public static void main(String[] args) {

		String [] array = {"Hello","Plane","Boat","Lock","Swimming"};
		int length = array.length;
		for(int i = 0;i < array.length;i++){
			int randomNumber = (int)(Math.random()* 5);
			String word = array[randomNumber];
			System.out.println(array[randomNumber]);
			if(Character.isLetter(length)){
				int counter = 0;
				counter++;

			}

			System.out.println("A " + word.length() + " letter word has been chosen at random\n"
					+ "Please guess a letter");
			JOptionPane.showMessageDialog(null,word);

			try(Scanner scanner = new Scanner(System.in)){
				String character = scanner.nextLine();
				boolean isFound = false;
				if(word.contains(character)){
					System.out.println(word + " : Congratulations's : " + character + " is found within "
							+ word);
					boolean isNotFound = true;
				}else{
					System.out.println("Character not found please try again");
				}
				//int i = 0;
				int numOfTrys = 8;
				boolean isFound2 = false;
				for(i = 0;i <= numOfTrys; i++){
					if(numOfTrys != i){
						String character1 = scanner.nextLine();
						System.out.println("try again");
						String character2 = scanner.nextLine();
						System.out.println("try again");
						String character3 = scanner.nextLine();
						System.out.println("try again");
						String character4 = scanner.nextLine();
						System.out.println("try again");
						String character5 = scanner.nextLine();
						System.out.println("try again");
						String character6 = scanner.nextLine();
						System.out.println("try again");
						String character7 = scanner.nextLine();
					}else{
						boolean isNotFound2 = true;

						/*Scanner scanner1 = new Scanner(System.in);
					String character1 = scanner1.nextLine();*/
					}
					System.out.println("No remaining turns left, enter €1 to play again");
					
				}

			}

		}

	}

}


