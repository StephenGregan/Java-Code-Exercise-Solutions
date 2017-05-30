package sheet10Inheritance;

public class Ex1Rectangle extends Ex1Shape {

	private int height;
	private int width;
	private int area;
	
	public Ex1Rectangle() {
		
	}
	
	public Ex1Rectangle(Colour colour,int height,int width) {
		super(colour);
		setHeight(height);
		setWidth(width);
		
	}
	
	public void draw() {
		System.out.println("This is a " + getColour().toString().toLowerCase() + ""+ " rectangle" + " with an area of " + getArea() + "\n");
			
	}

	public  int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public  int getArea() {
		area = height * width;
		return area;
	}

	@Override
	public String toString() {
		return "Colour " + colour + "Height " + height + "Width " + width
				+ "Area " + area;
	}
	
	
}
