package sheet4ATwoDimernsionalArrays;

public class Ex3Clock {

	public static void main(String[] args) {

		//Used to represent 24 hours in a day.
		for(int j = 0;j < 24;j++){
			//Used to represent 60 minutes in an hour.
			for(int k = 0;k < 60;k++){
				/*
				for(int i = 0;i < 60;i++){
					System.out.printf("%02d : %02d : %02d\n",j,k,i);
					*/
				//Prints out every hour in a day. Prints out the minutes in a hour. (02 is added to numbers without this the clock would output e.g 0:32
				//with 02 in placed the output is 00:32)
					System.out.printf("%02d : %02d\n",j,k);
				}
				//System.out.printf("%02d"  ,k);

				
			//}

		}

		//System.out.println();
	}

}
