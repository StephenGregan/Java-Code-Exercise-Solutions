package sheet16StringsAndStringBuilder;

import java.util.Scanner;

public class Ex5SearchForALetter {

	/*static String searchString = "Hello my name is Stephen";*/

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			System.out.println("Enter a word\nWords entered are case sensitive");	
			String s = scanner.nextLine();

			System.out.println("Enter a charcter");	
			String userinput = scanner.nextLine();

			char[] c = s.toCharArray();
			boolean isFound = false;
			for(int i=0; i < c.length; i++){
				if(userinput.charAt(0) == c[i]){
					System.out.println("Character found at postion " + i);
					
				}
				
			}

		}
		
	}
	
}


