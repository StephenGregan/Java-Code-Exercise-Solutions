package sheet16StringsAndStringBuilder;

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;*/
import java.util.Scanner;

public class Ex4Reverse {

	public static void main(String[] args) {
		
	/*	String input = "";
		System.out.println("Enter the input string");
		Scanner scanner = new Scanner(System.in);
		System.out.println(scanner.nextLine());
		
		StringBuffer br = new StringBuffer("Reverse Flash");
		System.out.println(br.reverse());*/
		Scanner s = new Scanner(System.in);
		System.out.println("Type a sentence below : ");
		String text = s.nextLine();
		
		char [] letters = text .toCharArray();
		for(int i = letters.length -1;i > 0;i--){
			System.out.print(letters[i]);
			
		}
		System.out.println();
		
		for(int i = text.length() -1;i > 0;i--){
			System.out.print(text.charAt(i));
			
		}
		
		/*try{*/
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			input = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		char[] try1 = input.toCharArray();
		for(int i = try1.length-1;i >= 0;i--){
			System.out.println(try1[i]);*/
			/*}catch(IOException e){
				e.printStackTrace();*/

		}


		/*Scanner scanner = new Scanner(System.in);
		String reverse = new Stringbuffer(scanner).reverse().to.String();
		 */

		
		
	}

//}
//}
