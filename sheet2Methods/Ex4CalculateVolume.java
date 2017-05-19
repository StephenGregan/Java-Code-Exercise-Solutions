package sheet2Methods;

public class Ex4CalculateVolume {

	public static void main(String[] args) {

		Ex4CalculateVolume ex4 = new Ex4CalculateVolume();
		double depth = 10;
		double width = 12.5;
		double breadth = 22.1;
		ex4.calcVolume(depth,width,breadth);

	}

	public void calcVolume(double depth,double width,double breadth){
		double volume = depth * width * breadth;
		System.out.println("The volume is : " + volume);


	}
}
