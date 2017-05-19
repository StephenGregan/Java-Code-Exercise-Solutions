package sheet4ATwoDimernsionalArrays;

public class Ex3Calender {

	public static void main(String[] args) {
		// 1D  String Array
		String [] monthName = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		// 1D  String Array
		String [] monthHeading = {"M","T","W","T","F","S","S"};
		// 1D int Array
		int [] monthStartingDay = {6,2,2,5,0,3,5,1,4,6,2,4};
		// Represents spaces type as integer.
		int spaces;
		// 2D int Array
		int [][] monthDays = {{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30},
				{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},
		};

		// Nested for loop
		// monthDays can be represented with 12. e.g i < 12.
		for(int i = 0;i < monthDays.length;i++){
			System.out.print("\n \n");
			System.out.printf(monthName[i] + "\n");
			// monthHeading can be represented also with 7. e.g j < 7.
			for(int j = 0;j < monthHeading.length;j++){
				System.out.print(monthHeading[j] + "       ");

			}
			// int spaces = every integer in the monthStartDay using [i].
			spaces = monthStartingDay[i];
			// Prints new line.
			System.out.print("\n");
			// For loop
			for(int h = 0;h < spaces;h++){
				// Prints out tab.
				System.out.printf("\t");

			}
			// For loop
			for(int k = 0;k < monthDays[i].length;k++){
				System.out.print(monthDays[i][k] + "\t");
				// If statement. Curly brackets are optional if the is only one if statement(It is good practice to use curly brackets regardless).
				if(k + spaces == 6 || k + spaces == 13 || k + spaces == 20 || k + spaces == 27 || k + spaces == 34){
					// Prints out newline.
					System.out.println("\n");

				}

			}

		}
		
	} // End of main	
	
} // End of class

