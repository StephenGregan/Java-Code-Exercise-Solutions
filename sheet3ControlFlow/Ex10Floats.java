package sheet3ControlFlow;

public class Ex10Floats {

	public static void main(String[] args) {

		float num1 = 2;
		float num2 = 2;
		float num3 = 2;

		Ex10Floats ex10Floats = new Ex10Floats();
		ex10Floats.sameOrDifferent(num1, num2, num3);
		ex10Floats.largestAndSmallest(num1, num2, num3);
		ex10Floats.printAverage(num1, num2, num3);

	}

	public void largestAndSmallest(float a,float b,float c){

		float largest = a;
		if(b > largest){
			largest = b;
			if(c > largest){
				largest = c;
				System.out.println("The largest is :" +  largest);

				float smallest = a;
				if(b < smallest){
					smallest = b;
					if(c < smallest){
						smallest = c;
						System.out.println("The smallest is :" + smallest);

					}
				}

			}

		}
	}
	public void printAverage(float a,float b,float c){
		float average = (a + b + c) / 3;
		System.out.printf("The average is %.2f",average);

	}

	public void sameOrDifferent(float a,float b,float c){
		if(a == b && b == c){
			System.out.println("All numbers are the same");
		}
		else{
			if(a != b && b != c && a != c){
				System.out.println("All numbers are different");	
			}
			else{
				System.out.println("Two are the same");
			}

		}

	}

}
