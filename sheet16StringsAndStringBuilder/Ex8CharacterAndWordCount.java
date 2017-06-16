package sheet16StringsAndStringBuilder;

import java.util.Scanner;

public class Ex8CharacterAndWordCount {

	public static void main(String[] args) {
		
		System.out.println("Enter sentence");
		Scanner scanner = new Scanner(System.in);
		String userinput = scanner.nextLine();
		int count = 0;
		char [] c = userinput.toCharArray();
		/*for(int i = 0; i < userinput.length();i++){*/
			//int numOfWords = userinput.indexOf(count);
			//System.out.println(words);
			System.out.println("Sentence with spaces included : " + userinput.length());
			String sentence = userinput.replace(" ", "");
			System.out.println("Sentence with spaces excluded : " + sentence.length());
	
			String [] words = userinput.split(" ");
			int b = 0;
			for(int i =0;i < words.length;i++){
				if(words.toString().contains(" ")){
					
				}
				b++;
			}
			System.out.println("Total words in sentence : " + (b));
	}
	/*int count = 0;
	public int countWords(String userinput){
		if(userinput == null){
		return 0;
		
		}
		String userInput = userinput.trim().toString();
		int count = userinput.isEmpty() ? 0 : userinput.split("\\s+").length;
		return count;
	}
	@Override
	public String toString() {
		return "Ex8CharacterAndWordCount [count=" + count + "]";*/
	}
	
//}
