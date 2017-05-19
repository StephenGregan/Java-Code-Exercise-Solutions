package sheet4BArrays;

import java.util.Random;

public class Ex1LargestSmallestSearchingSortingAnArray {

	public static void main(String[] args) {

		int [] num = {1,2,3,4,5,6,7,8,9,10};


		int [] randomNumbers = new int [100];

		Ex1LargestSmallestSearchingSortingAnArray ex1 = new Ex1LargestSmallestSearchingSortingAnArray();
		ex1.findSmallestElement(randomNumbers);
		ex1.findLargestElement(randomNumbers);
		ex1.searchArray(randomNumbers);
		ex1.sortArray(randomNumbers);
		ex1.printArray(randomNumbers,num);

		int num = random.nextInt(100) + 1;
		Random random = new Random();

		for(int i =0;i < randomNumbers.length;i++){
			randomNumbers[i] = (int)(random.nextInt(100) + 1);
			System.out.println("Random number generated: " + randomNumbers[i]);

		}

	}

	public void findSmallestElement(int [] num){
		int smallest = 0;
		for(int i = 0;i < num.length;i++){
			if(num[i] < smallest){
				smallest = num[i];
				System.out.println("The smallest number is : " + smallest);

			}

		}

	}
	public void findLargestElement(int [] num){
		int largest = 0;
		for(int i = 0;i < num.length;i++){
			if(num[i] > largest){
				largest = num[i];
				System.out.println("The largest number is : " + largest);

			}

		}

	}

	public void searchArray(int [] num){
		if(num[3] == 4){
			System.out.println(num[4]);
		}else{
			System.out.println("Numbers do not match !!");
		}

	}

	public void sortArray(int [] num){


	}


	public void printArray(int [] num){


	}

}



			

