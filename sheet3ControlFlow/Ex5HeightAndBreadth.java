package sheet3ControlFlow;

public class Ex5HeightAndBreadth {

	public static void main(String[] args) {

		double height = 6;
		double length = 5;

		Ex5HeightAndBreadth ex5 = new Ex5HeightAndBreadth();
		ex5.calculateAreaAndPerimeter(height,length);

	}
	public void calculateAreaAndPerimeter(double height,double length){
		double area;
		double perimeter;

		area = height * length;
		perimeter = 2 * height + 2 * length;

		if(height == length){
			System.out.printf("Area of a square is %.2f and "+ "perimeter is %.2f",area,perimeter);
		}else{
			System.out.printf("Area of a square is %.2f and "+ "perimeter is %.2f",area,perimeter);
		}

	}

}
