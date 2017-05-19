package sheet4Arrays;

public class Ex7ArrayElements {

	public static void main(String[] args) {

		int [] numbers = new int [] {2,4,6,8,10,12,14,16,18,20};

		int largest  = numbers[0];
		int smallest = numbers[0];

		for(int i = 0;i < numbers.length;i++){
			if(numbers[i] > largest)
				largest = numbers[i];
			else if(numbers[i] < smallest)
				smallest = numbers[i];

			//Enhanced for loop
			for(int nums:numbers){
				if(nums > largest){
					largest = nums;
				}

			}

		}

		System.out.println("The Largest number is: " + largest);
		System.out.println("The Smallest number is: " + smallest);
	}

}
