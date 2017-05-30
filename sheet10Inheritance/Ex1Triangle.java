package sheet10Inheritance;

public class Ex1Triangle extends Ex1Shape {
	
	public Ex1Triangle(){
		
	}
	
	public Ex1Triangle( Colour colour){
		super(colour);
	}

	public void draw(){
		System.out.println("This is a " + getColour().toString().toLowerCase()  + " triangle " + "\n");
		
	}
	
}
