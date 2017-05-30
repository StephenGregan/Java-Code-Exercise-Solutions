package sheet9Inheritance;

public class Ex1Furniture {

	public static String colour;
	public static String materialType;
	public static int furnitureCounter;
	
	public Ex1Furniture(){
		furnitureCounter++;
		
	}
	
	public Ex1Furniture(String colour,String materialType){
		this();
		setColour(colour);
		setMaterialType(materialType);
		
		
	}
	
	public static String getColour() {
		return colour;
	}
	public static void setColour(String colour) {
		Ex1Furniture.colour = colour;
	}
	public static String getMaterialType() {
		return materialType;
	}
	public static void setMaterialType(String materialType) {
		Ex1Furniture.materialType = materialType;
	}
	@Override
	public String toString() {
		return  "Colour " + colour.toString() + "\nMaterial Type " + materialType.toString();
	}
	
	
}
