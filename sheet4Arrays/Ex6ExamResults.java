package sheet4Arrays;

public class Ex6ExamResults {

	public static void main(String[] args) {

		int [] results1 = {50,60,75};
		int [] results2 = {39,75,41};
		int [] results3 = {45,40,33};

		Ex6ExamResults ex6 = new Ex6ExamResults();
		ex6.printResults(results1);
		ex6.printResults(results2);
		ex6.printResults(results3);

	}

	private void printResults(int [] result){
		System.out.println("Results 1 : \t");

		for(int num : result){
			System.out.print(num + "      ");

		}

		boolean result1 = calculateResults(result);
		
		System.out.println(result1 ? "Pass" : "Fail");

	}

	public boolean calculateResults(int [] examResults){
		int numOfPasses = 0;
		if(examResults[0] >= 40){
			numOfPasses++;
			if(examResults[1] >= 40){
				numOfPasses++;
				if(examResults[2] >= 40){
					numOfPasses++;
				}
				if(numOfPasses == 0 || numOfPasses == 1){
					return false;
				}else if(numOfPasses == 2){
					int total = 0;
					for(int num : examResults){
						total += num;

					}

					double average = total / 3.0;

					return (average >= 50) ? true : false;

				}else{
					
				}
			}
		}
		return true;
	}
	
}



