package sheet9Inheritance;

public class Ex1Bed extends Ex1Furniture {
	
	public String size;
	public boolean headboardYes = true;
	//public static boolean headboardNo = false;
	
	public Ex1Bed(){
	super();
		
	}
	
	public Ex1Bed(String colour,String materialType,boolean headboardYes,String size){
		super(colour,materialType);
		//setHeadboardNo(headboardNo);
		/*setHeadboardYes(headboardYes);
		setSize(size);*/
		this.headboardYes = headboardYes;
		this.size = size;
		
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public boolean isHeadboardYes() {
		return headboardYes;
	}
	public void setHeadboardYes(boolean headboardYes) {
		this.headboardYes = headboardYes;
	}
	/*public static boolean isHeadboardNo() {
		return headboardNo;
	}
	public static void setHeadboardNo(boolean headboardNo) {
		Ex1Bed.headboardNo = headboardNo;
	}*/

	@Override
	public String toString() {
		return  String.format("\nColour  %s \nMaterial Type %s \nHeaboard %s \nSize %s", getColour(), getMaterialType(),
				(headboardYes) ? "Yes" : "No",size.toString());
	}
	
	
}
