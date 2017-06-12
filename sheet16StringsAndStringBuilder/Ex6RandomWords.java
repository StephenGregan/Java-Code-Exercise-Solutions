package sheet16StringsAndStringBuilder;

public class Ex6RandomWords {

	public static void main(String[] args) {

		String [] array = {"Hello","Plane","Boat","Lock","Swimming"};
			int length = array.length;
			/*for(int i = 0;i < array.length;i++){*/
			int randomNumber = (int)(Math.random()* 5);
			String word = array[randomNumber];
			System.out.println(array[randomNumber]);
			if(Character.isLetter(length)){
				int counter = 0;
				counter++;
				
			}
			for(int counter = 0; counter < array.length;counter++){
				String letters = new String(array[counter]);
				System.out.println("This word contains " + length + " characters");
			}
			/*System.out.println(word);*/
			
		}


	}

//}
