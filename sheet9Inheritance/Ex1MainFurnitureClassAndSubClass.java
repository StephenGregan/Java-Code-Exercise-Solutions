package sheet9Inheritance;

public class Ex1MainFurnitureClassAndSubClass {

	public static void main(String[] args) {
		
		Ex1Furniture f1 = new Ex1Furniture("Red","Wooden");
		System.out.println(f1);
		Ex1Table t1 = new Ex1Table("Blue","Wooden",true,"Round");
		System.out.println(t1);
		//Ex1Table t0 = new Ex1Table("Green","Wooden","Square",true);
		Ex1Bed b1 = new Ex1Bed("Green","Metal",false,"Large");
		System.out.println(b1);
		Ex1Chair c1 = new Ex1Chair("Hot Pink", "Cushion",true,"Comfy");
		System.out.println(c1);
		System.out.println("Furniture items created : " + Ex1Furniture.furnitureCounter);
		
	}
	
}
