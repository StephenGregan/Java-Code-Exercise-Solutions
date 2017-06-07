package sheet14TraineesAndAprentices;

public class Electrician extends Trainee implements Apprentice {
	
	private int phase;
	private String employersName;

	public Electrician() {
		
	}
	
	public Electrician(String name,String dateOfBirth,int ppsNumber) {
		super(name,dateOfBirth,ppsNumber);
		setEmployersName(employersName);
		
	}

	@Override
	public void setEmployersName(String employersName) {
		this.employersName = employersName;
		setPhase(phase);
	}

	@Override
	public String getEmployersName() {
		
		return employersName;
	}

	@Override
	public void setPhase(int phase) {
		if(phase >= PHASE_ONE && phase <= PHASE_SIX){
			this.phase = phase;
		}else{
			System.out.println(phase + "is not valid" + "setting to one");
			this.phase = PHASE_ONE;
		}
	}

	@Override
	public int getPhase() {
		
		return phase;
	}

	@Override
	public String toString() {
		return "Electrition [phase=" + phase + ", employersName=" + employersName + "]";
	}
	
	
}
