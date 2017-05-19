package sheet3ControlFlow;

public class Ex2Loops {

	public static void main(String[] args) {

		int counter = 100;

		while(counter <= 200){
			System.out.println(counter + " ");
			counter += 2;
		}
		for(int i = 100;i < 200;System.out.println(i + " "),i += 2){	
		}
		System.out.println("\n End of first for loop");
		for(int i = 0;i <= 200;i += 2){
			System.out.println(i + " ");
		}

	}

}
