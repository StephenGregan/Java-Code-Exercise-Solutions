package sheet14TraineesAndAprentices;

public class Carpenter extends Trainee implements Apprentice {
	
	private int phase;
	private String employersName;

	public Carpenter() {
		
	}
	
	public Carpenter(String name,String dateOfBirth,int ppsNumber) {
		super(name,dateOfBirth,ppsNumber);
		
	}

	@Override
	public void setEmployersName(String name) {
		
	}

	public String getEmployersName() {
		
		return employersName;
	}

	@Override
	public void setPhase(int phase) {
		
	}

	public int getPhase() {
		
		return phase;
	}

	@Override
	public String toString() {
		return "Carpenter [phase=" + phase + ", employersName=" + employersName + "]";
	}
	
	
}
