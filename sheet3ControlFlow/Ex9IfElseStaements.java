package sheet3ControlFlow;

import java.util.Scanner;

public class Ex9IfElseStaements {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter an integer :");
		int num = scanner.nextInt();


		if(num >=1 && num <= 10 ){
			System.out.println("The number is between numbers 1 - 10 ");
		}else
			if(num >= 11 && num <= 20){
				System.out.println("The number is between numbers 11 - 20 ");
			}else
				if(num >= 21 && num <= 30){
					System.out.println("The number is between the numbers 21 - 30 ");
				}
				else
					if(num >= 31 && num <= 40){
						System.out.println("The number is between the numbers 31 -40 ");
					}
					else
						if(num >= 41 && num <= 50){
							System.out.println("The number is between number 41 - 50");
						}
						else
							System.out.println("You typed under 0 or over 50");

	}	

}

