package sheet3ControlFlow;

import java.util.Random;

public class Ex14ADiceGame {

	public static void main(String[] args) {
		
		int dice1 = (int)(Math.random() * 6) + 1;
		int dice2 = (int)(Math.random() * 6) + 1;
		
		System.out.printf("Dice1: %d\nDice2: %d\n",dice1,dice2);
		Ex14ADiceGame ex14 = new Ex14ADiceGame();
		int score = ex14.calculateScore(dice1,dice2);
		System.out.println("Score" + score);
		
	}
	
	private int calculateScore(int dice1,int dice2){
		int score = 0;
		
		if(dice1 == 6 || dice2 == 6){
			score = dice1 = dice2;	
		}else{
			score = dice1 * dice2;
		
		}
		
		if(dice1 == 3){
			score += 10;
		}else if (dice1 == 5)
				score -= -4;
			
		if(dice2 == 3)
			score += 10;
			else if(dice2 == 5)
				score -= 4;
			
		return score;
			
		
			
	}
}
