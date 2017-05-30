package sheet11InheritancePayRollSystem;

public final class PieceWorker {

	private double wagePerPiece;
	private int quantity;
	private double earnings;
	
	public PieceWorker(){
		
		
	}
	
	public PieceWorker(String firstName,String lastName,double wagePerPrice,int quantity){
		
		
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getWagePerPiece() {
		return wagePerPiece;
	}

	public void setWagePerPiece(double wagePerPiece) {
		this.wagePerPiece = wagePerPiece;
	}
	
	public double getEarnings(){
		
		return earnings;
	}

	@Override
	public String toString() {
		return "PieceWorker [wagePerPiece=" + wagePerPiece + ", quantity=" + quantity + ", earnings=" + earnings + "]";
	}
	
	
}
