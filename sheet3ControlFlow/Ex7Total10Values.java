package sheet3ControlFlow;

import java.util.Scanner;

public class Ex7Total10Values {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int total = 0;
		int i = 0;


		for( ;i<10;i++){
			System.out.printf("Enter number %d : ",i+1);

			int num = scanner.nextInt();
			total = total + i;
			System.out.println("You typed : " + num);

		}

		System.out.println("Total : " + total);
		System.out.println("Average : " + (double)total / i);
	}

}
