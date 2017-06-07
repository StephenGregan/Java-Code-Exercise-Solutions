package sheet14TraineesAndAprentices;

public class SoftwareDeveloper extends Trainee {

	public SoftwareDeveloper() {
		
	}

	public SoftwareDeveloper(String name,String dateOfBirth,int ppsNumber) {
		super(name,dateOfBirth,ppsNumber);

	}

	@Override
	public String toString() {
		return "SoftwareDeveloper" + super.toString();
	}
	
	
}
