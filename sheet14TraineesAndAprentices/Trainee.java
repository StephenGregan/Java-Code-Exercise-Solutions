package sheet14TraineesAndAprentices;

public abstract class Trainee {

	private String name;
	private String dateOfBirth;
	private int ppsNumber;
	
	public Trainee (){
		
	}
	
	public Trainee(String name,String dateOfBirth,int ppsNumber) {
		setName(name);
		setDateOfBirth(dateOfBirth);
		setPpsNumber(ppsNumber);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getPpsNumber() {
		return ppsNumber;
	}
	public void setPpsNumber(int ppsNumber) {
		this.ppsNumber = ppsNumber;
	}
	@Override
	public String toString() {
		return "Trainees  name is : " + name + "\nDate of birth is : " + dateOfBirth + "\nPPS number is : " + ppsNumber;
	}
	
	
}
