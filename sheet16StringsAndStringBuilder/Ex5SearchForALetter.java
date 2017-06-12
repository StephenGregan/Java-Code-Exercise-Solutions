package sheet16StringsAndStringBuilder;

import java.util.Scanner;

public class Ex5SearchForALetter {

	/*static String searchString = "Hello my name is Stephen";*/

	public static void main(String[] args) {
		
		
		/*Scanner scanner = new Scanner(System.in);
		String userinput = scanner.nextLine();*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a word");	
		String s = scanner.nextLine();
		
		System.out.println("Enter a charcter");	
		String userinput = scanner.nextLine();
		
		char[] c = s.toCharArray();
		
		for(int i=0; i<c.length; i++){
			
			if(userinput.charAt(0) == c[i]){
				
				System.out.println("Character found at postion " + i);
			}
			
		}
		
	/*	int cnt = 0;
		for(int i = 0;i < s.length();i++){
			if(s.charAt(i) == c){
				cnt++;
				System.out.println("Character found at position " + i);


			}

		}
*/
		/*String searchString = "Hello my name is Stephen";*/
		/*int firstIndex = searchString.lastIndexOf("S");
		System.out.println("The first occurance of the letter 'S', is found at " + firstIndex);
		int answer = 0;
		if(args.length > 0){
			char searchChar = args[0].charAt(7);
			for(int i = 0;i < searchString.length();i++){
				if(searchString.charAt(i) == searchChar){
					answer += 1;
					System.out.println("Number of occurences" + args[0] + "is" + answer);
				}
				}

			}*/

		/*	Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word below\n");
		System.out.println(scanner.nextLine());
		System.out.println(String.contains(scanner));
		System.out.println("Enter a search character below\n");
		System.out.println(scanner.nextLine());*/
		/*char [] letters = scanner.toCharArray();*/
		/*char str = scanner;
		System.out.println(Str.indexOf());*/


	}
}


