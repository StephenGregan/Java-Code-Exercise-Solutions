package sheet3ControlFlow;

import java.util.Random;

public class Ex13TotalTwoDice {

	public static void main(String[] args) {

		int dice1 = (int)(Math.random() * 6) + 1;
		int dice2 = (int)(Math.random() * 6) + 1;

		System.out.printf("Dice1 is: %d\nDice2 is: %d\n",dice1,dice2);

		Random random = new Random();
		int num = random.nextInt(6);
		System.out.println("Using random.nextInt()" + (num + 1));

	}

}
