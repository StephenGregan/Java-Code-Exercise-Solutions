package sheet16StringsAndStringBuilder;

import java.util.Scanner;

public class Ex7ComparingWords {

	public static void main(String[] args) {

		System.out.println("Please enter two words below : ");
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		System.out.println("The first word is : " + word);
		String word1 = scanner.nextLine();
		System.out.println("The second word is : " + word1);
		String a = word;
		String b = word1;
		//System.out.println(word.compareTo(word1));
		
		if(word.compareTo(word1) >= -1){
			//System.out.println(word.compareTo(word1));
			System.out.println(word + " follows " + word1);
			boolean isnotTrue = false;
		}else if(word1.compareTo(word) >= 1) {
			//System.out.println(word1.compareTo(word));
			System.out.println(word + " procedes " + word1);
			
			boolean istrue = true;
		}
	
	}

}
