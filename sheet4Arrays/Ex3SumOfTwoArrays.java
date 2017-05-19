package sheet4Arrays;

import java.lang.reflect.Array;

public class Ex3SumOfTwoArrays {

	public static void main(String[] args) {

		double [] array1 = {2,4,6,8,10,12,14,16};
		double [] array2 = {1,2,3,4,5,6,7,8};
		Ex3SumOfTwoArrays ex3 = new Ex3SumOfTwoArrays();
		ex3.printMyArray(array1);
		ex3.printMyArray(array2);
		ex3.sumOfTwoArrays(array1, array2);
	}

	public void sumOfTwoArrays(double [] array1,double [] array2){
		System.out.printf("%-12s%-12s%s\n","array 1","array 2","Sum");
		for(int i = 0;i < array1.length;i++){
			System.out.printf("%-12d%-12d%d\n",array1[i],array2[i],array1[i] + array2[i]);
		}	
	}

	public void printMyArray(double [] myArray){
		for(int i = 0;i < myArray.length;i++){
			System.out.print(myArray[i] + " ");
		}
		System.out.println();
	}

}



