package sheet3ControlFlow;

import java.util.Scanner;

public class Ex12ExaminationMarks {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int marks;
		System.out.println("Enter the first score");
		int score1 = sc.nextInt();
		System.out.println("Enter the second score");
		int score2 = sc.nextInt();
		System.out.println("Enter the third score");
		int score3 = sc.nextInt();

		Ex12ExaminationMarks ex12 = new Ex12ExaminationMarks();
		///int result = 
				ex12.calculateGrade(score1,score2,score3);
		//System.out.println(result);

	}

	public void calculateGrade(int score1,int score2,int score3){

		int passScore = 40;

		if(score1 >= passScore && score2 >= passScore && score3 >= passScore)
		System.out.println("Passed all three exams");

		else if(score1 <= passScore && score2 >= passScore && score3 >= passScore
				|| score1 >= passScore && score2 <= passScore && score3 >= passScore
				|| score1 >= passScore && score2 >= passScore && score3 <= passScore){

			double average = (score1 + score2 + score3) / 3;
			if(average >= 50)
				System.out.println("You passed two exams. Your average score is : " + average + "\nPASSED");
		}

		else if(score1 <= passScore && score2 <= passScore && score3 >= passScore
				|| score1 >= passScore && score2 <= passScore && score3 <= passScore
				|| score1 <= passScore && score2 >= passScore && score3 <= passScore){
			System.out.println("Failed two exams");

		}else{
			System.out.println("Failed");

		}
		//return passScore
	}
}
