package sheet14TraineesAndAprentices;

public interface Apprentice {

	int PHASE_ONE = 1;
	int PHASE_TWO = 2;
	int PHASE_THREE = 3;
	int PHASE_FOUR = 4;
	int PHASE_FIVE = 5;
	int PHASE_SIX = 6;
	
	 void setEmployersName(String employersName){
		 String getemployersName();
		 
	 }
	/* public String getEmployersName();*/
	 public void setPhase(int phase);
	 /*public int getPhase();*/
}
