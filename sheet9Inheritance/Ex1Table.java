package sheet9Inheritance;

public class Ex1Table extends Ex1Furniture {
	
	public boolean IsExpandable = true;
	//public static boolean IsNotExpandable = false;
	public String tableshape;
	
	public Ex1Table(){
		/*this();*/
		/*super();*/
		
	}
	
	public Ex1Table(String colour,String materialType,boolean IsExpandable,String tableshape){
		super(colour,materialType);
		//this.IsExpandable = IsExpandable;
		//setIsExpandable(IsExpandable);
		this.IsExpandable = IsExpandable;
		//setIsNotExpandable(isNotExpandable);
		//setTableshape(tableshape);
		this.tableshape = tableshape;
	}
	
	public boolean getisIsExpandable() {
		return IsExpandable;
	}
	public void setIsExpandable(boolean isExpandable) {
		this.IsExpandable = isExpandable;
	}/*
	public static boolean isIsNotExpandable() {
		return IsNotExpandable;
	}
	public static void setIsNotExpandable(boolean isNotExpandable) {
		IsNotExpandable = isNotExpandable;
	}*/
	public String getTableshape() {
		return tableshape;
	}
	public void setTableshape(String tableshape) {
		this.tableshape = tableshape;
	}

	@Override
	public String toString() {
		return  String.format("\nColour  %s \nMaterial Type %s \nIs Expandable %s \nTable shape %s\n\n", getColour(), getMaterialType(),
				(IsExpandable) ? "Yes" : "No",tableshape.toString());
	}
	
	

}
