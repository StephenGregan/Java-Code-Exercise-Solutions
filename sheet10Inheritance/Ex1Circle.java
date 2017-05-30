package sheet10Inheritance;

public class Ex1Circle extends Ex1Shape {
	
	public int radius;
	
	public Ex1Circle(){
		
	}
	
	public Ex1Circle(Colour colour,int radius){
		super(colour);
		setRadius(radius);
		
	}
	@Override
	public void draw(){
		System.out.println("This is a " + getColour().toString().toLowerCase()  + " circle " + "with a radius of " + getRadius() + "\n");
		
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Colour " + colour.toString() + "Radius " + radius;
	}
	
	
}
