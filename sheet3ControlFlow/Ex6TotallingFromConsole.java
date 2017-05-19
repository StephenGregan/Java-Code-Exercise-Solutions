package sheet3ControlFlow;

import java.util.Scanner;

public class Ex6TotallingFromConsole {

	public static void main(String[] args) {

		int a = 0;
		int total = 0;
		Scanner scanner = new Scanner(System.in);

		for(int i = 0;i < 3;i++){
			System.out.println("Enter an interger : ");

			a = scanner.nextInt();
			total += a;

		}
		System.out.println("The running total is : " + total);
	}

}
