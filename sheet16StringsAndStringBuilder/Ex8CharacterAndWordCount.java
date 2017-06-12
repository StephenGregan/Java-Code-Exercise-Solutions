package sheet16StringsAndStringBuilder;

public class Ex8CharacterAndWordCount {

	public static void main(String[] args) {
		
		String sentence = "It's a lovely day today.";
		
		System.out.println("Character's with spaces : " + sentence.length());
		System.out.println(sentence.replaceAll(" ", ""));
		System.out.println("Character's without spaces : " + sentence.replaceAll(" ", ""));
		
	/*	for(int i = 0;i < sentence.length();i++){
		if(sentence.charAt(i) != ''){
			System.out.println(sentence.length());
		}*/
	//	}

		/*int charCount = 0;
		char temp;
		for(int i = 0;i < sentence.length();i++){
			temp = sentence.charAt(i);
			if(temp.isLetter()){
				charCount++;
				
			}
		}*/
	}

}
