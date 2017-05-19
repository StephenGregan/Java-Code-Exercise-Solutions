package sheet4Arrays;

import java.util.Scanner;

public class Ex2DoubleArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double [] nums = new double [10];
		double total = 0;
		int i = 0;

		for( ; i<nums.length;i++){
			System.out.printf("Enter double %d : ",i + 1);
			nums[i] = input.nextDouble();
			total = total + nums[1];

		}

		for(i =0;i<nums.length;i++){
			System.out.println(nums[i]);

		}

		System.out.printf("The total is %.2f\n",total);
		System.out.printf("The average is %.2f",total / i);
	}

}
