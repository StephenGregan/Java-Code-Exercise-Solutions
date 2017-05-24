package sheet6ArraysOfObjects;

//import java.util.Scanner;

import sheet5PracticeCreatingClasses.Ex1Car;

public class Ex1CarClass {

	public static void main(String[] args) {

	/*	Scanner input = new Scanner(System.in);

		Ex1Car [] cars = new Ex1Car[3];
		String temp;
		
		for(int i = 0;i < cars.length;i++){
			System.out.println("Enter a make please : ");
			
		}
		*/
		
		Ex1Car ee = new Ex1Car("Honda","Civic",1.5);
		Ex1Car ee1 = new Ex1Car("Audi","A4",2.0);
		Ex1Car ee2 = new Ex1Car("Toyota","Corola",1.3);

		Ex1Car[] mm = {ee, ee1, ee2};

		for(int i =0;i <mm.length ;i++){
			System.out.println(mm[i]);

		}

	}

}


