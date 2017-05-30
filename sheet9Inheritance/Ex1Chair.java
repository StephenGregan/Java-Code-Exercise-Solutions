package sheet9Inheritance;

public class Ex1Chair  extends Ex1Furniture {

	public boolean gasLiftYes = true;
	//public static boolean gasLiftno = false;
	public String typeOfChair;
	
	public Ex1Chair(){
		
	}
	
	public Ex1Chair(String colour,String materialType,boolean gasLiftYes,String typeOfChair){
		super(colour,materialType);
		//setGasLiftno(gasLiftNo);
		setGasLiftYes(gasLiftYes);
		setTypeOfChair(typeOfChair);
		
	}
	
	public boolean isGasLiftYes() {
		return gasLiftYes;
	}
	public void setGasLiftYes(boolean gasLiftYes) {
		this.gasLiftYes = gasLiftYes;
	}
/*	public static boolean isGasLiftno() {
		return gasLiftno;
	}
	public static void setGasLiftno(boolean gasLiftno) {
		Ex1Chair.gasLiftno = gasLiftno;
	}*/
	public String getTypeOfChair() {
		return typeOfChair;
	}
	public void setTypeOfChair(String typeOfChair) {
		this
		.typeOfChair = typeOfChair;
	}

	@Override
	public String toString() {
		return  String.format("\nColour  %s \nMaterial Type %s \nGas lift %s \nType of chair %s\n", getColour(), getMaterialType(),
				(gasLiftYes) ? "Yes" : "No",typeOfChair.toString());
	}
	
}
