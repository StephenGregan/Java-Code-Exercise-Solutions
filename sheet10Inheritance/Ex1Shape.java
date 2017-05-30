package sheet10Inheritance;

enum Colour{
	RED,GREEN,BLUE,YELLOW,BLACK,PINK,ORANGE,WHITE,GREY;

}

public class Ex1Shape {

	public Colour colour;
	
	public Ex1Shape(){
		
	}
	
	public Ex1Shape(Colour colour){
		setColour(colour);
		
	}
	
	public void draw(){
		System.out.println("Drawing a shape");
		
	}

	public Colour getColour() {
		return colour;
	}

	public void setColour(Colour colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Colour: " + colour;
	}
	
	
}
