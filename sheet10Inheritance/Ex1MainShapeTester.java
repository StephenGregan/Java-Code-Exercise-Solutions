package sheet10Inheritance;

public class Ex1MainShapeTester {

	public static void main(String[] args) {

		/*String [] array = {"Circle","Square","Triangle","Rectangle",
				"Heart","Star","Diamond","Nonagon"};*/

		Ex1Rectangle rr = new Ex1Rectangle(Colour.BLACK,5,9);
		Ex1Rectangle rr1 = new Ex1Rectangle(Colour.BLUE,5,9);
		Ex1Rectangle rr2 = new Ex1Rectangle(Colour.GREEN,5,9);
		Ex1Rectangle rr3 = new Ex1Rectangle(Colour.GREY,5,9);
		Ex1Rectangle rr4 = new Ex1Rectangle(Colour.ORANGE,5,9);
		Ex1Rectangle rr5 = new Ex1Rectangle(Colour.PINK,5,9);
		Ex1Rectangle rr6 = new Ex1Rectangle(Colour.RED,5,9);
		Ex1Rectangle rr7 = new Ex1Rectangle(Colour.WHITE,5,9);
		Ex1Rectangle rr8 = new Ex1Rectangle(Colour.YELLOW,5,9);

		Ex1Circle circle = new Ex1Circle(Colour.BLACK, 88);
		Ex1Circle circle1 = new Ex1Circle(Colour.BLUE, 88);
		Ex1Circle circle2 = new Ex1Circle(Colour.GREEN, 88);
		Ex1Circle circle3 = new Ex1Circle(Colour.GREY, 88);
		Ex1Circle circle4 = new Ex1Circle(Colour.ORANGE, 88);
		Ex1Circle circle5 = new Ex1Circle(Colour.PINK, 88);
		Ex1Circle circle6 = new Ex1Circle(Colour.RED, 88);
		Ex1Circle circle7 = new Ex1Circle(Colour.WHITE, 88);
		Ex1Circle circle8 = new Ex1Circle(Colour.YELLOW, 88);

		Ex1Triangle tri = new Ex1Triangle(Colour.BLACK);
		Ex1Triangle tri1 = new Ex1Triangle(Colour.BLUE);
		Ex1Triangle tri2 = new Ex1Triangle(Colour.GREEN);
		Ex1Triangle tri3 = new Ex1Triangle(Colour.GREY);
		Ex1Triangle tri4 = new Ex1Triangle(Colour.ORANGE);
		Ex1Triangle tri5 = new Ex1Triangle(Colour.PINK);
		Ex1Triangle tri6 = new Ex1Triangle(Colour.RED);
		Ex1Triangle tri7 = new Ex1Triangle(Colour.WHITE);
		Ex1Triangle tri8 = new Ex1Triangle(Colour.YELLOW);
		

		Ex1Shape [] array1 = {rr,rr1,rr2,rr3,rr4,rr5,rr6,rr7,rr8,
								circle,circle1,circle2,circle3,circle4,circle5,circle6,circle7,circle8,
									tri,tri1,tri2,tri3,tri4,tri5,tri6,tri7,tri8};

		
		for(Ex1Shape a : array1){
			a.draw();
			
		}
	/*	for(int i = 0;i < array1.length;i++){
			System.out.println(array1[i].getColour());
			//System.out.println(array1[i].draw());
			if(array1[i] instanceof Ex1Circle){
				System.out.println("Circle");
			
			}
			if(array1[i] instanceof Ex1Rectangle){
				System.out.println("Rectangle");
					
			}
		}
		if(array.equals("Circle")){
			System.out.println("Circle");

		}*/


	}

}
