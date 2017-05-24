package sheet4BArrays;

import java.util.Arrays;
import java.util.Random;

public class Ex1LargestSmallestSearchingSortingAnArray {

	public static void main(String[] args) {

		//int [] num = {1,2,3,4,5,6,7,8,9,10};


		int [] randomNumbers = new int [100];

		Ex1LargestSmallestSearchingSortingAnArray ex1 = new Ex1LargestSmallestSearchingSortingAnArray();
		ex1.populateArrayWithRandomNumbers(randomNumbers);
		ex1.findSmallestElement(randomNumbers);
		ex1.findLargestElement(randomNumbers);
		ex1.searchArray(randomNumbers,25);
		ex1.sortArray(randomNumbers);
		ex1.printArray(randomNumbers);

		Arrays.sort(randomNumbers);
		ex1.printArray(randomNumbers);

		int foundAtPosition = Arrays.binarySearch(randomNumbers,25);

		System.out.println(foundAtPosition < 0 ? "Not found " : "25 Found at " + foundAtPosition);
		/*int num = random.nextInt(100) + 1;
		Random random = new Random();

		for(int i =0;i < randomNumbers.length;i++){
			randomNumbers[i] = (int)(random.nextInt(100) + 1);
			System.out.println("Random number generated: " + randomNumbers[i]);*/
		//}
	}
	/*public void findSmallestElement(int [] num){
		int smallest = 0;
		for(int i = 0;i < num.length;i++){
			if(num[i] < smallest){
				smallest = num[i];
				System.out.println("The smallest number is : " + smallest);

			}

		}

	}*/
	public void findSmallestElement(int [] num){
		if(num.length != 0){
			int smallest = num[0];
			for(int i = 1;i < num.length;i++){
				if(num[i] < smallest){
					smallest = num[i];

				}
				System.out.println("The smallest element is" + smallest);
			}
		}else{
			System.out.println("The array is empty");	
		}
	}
	/*public void findLargestElement(int [] num){
		int largest = 0;
		for(int i = 0;i < num.length;i++){
			if(num[i] > largest){
				largest = num[i];
				System.out.println("The largest number is : " + largest);

			}

		}

	}*/
	public void findLargestElement(int [] num){
		if(num.length != 0){
			int largest = num[0];
			int postionFound = 0;
			for(int i = 1;i < num.length;i++){
				if(num[i] > largest){
					largest = num[i];
					postionFound = i + 1;	
				}
			}
			System.out.printf("The largest element is %d at postition %d\n",largest,postionFound);
		}else{
			System.out.println("Empty array");
		}
	}
	/*public void searchArray(int [] num){
		if(num[3] == 4){
			System.out.println(num[4]);
		}else{
			System.out.println("Numbers do not match !!");
		}

	}*/

	public void searchArray(int [] num,int value){
		for(int i = 0;i < num.length;i++){
			if(num[i] == value){
				System.out.printf("%d found at postion %d\n",value,i + 1);
				break;
			}
		}
	}
	public void sortArray(int [] num){
		for(int i =0;i < num.length;i++){
			int postion = i;
			int smallest = num[i];
			for(int j =0;j < num.length;j++){
				if(num[j] < smallest){
					smallest = num[j];
					postion = j;		
				}

			}
			int temp = num[i];
			num[i] = smallest;
			num[postion] = temp;	
		}
	}
	public void printArray(int [] num){
		for(int nums : num){
			System.out.println(num + "  ");
		}
		System.out.println();
	}
	public void populateArrayWithRandomNumbers(int [] num){
		Random random = new Random();
		for(int i = 0;i < num.length;i++){
			num[i] = random.nextInt(15) + 1;
		}
	}
}



			

