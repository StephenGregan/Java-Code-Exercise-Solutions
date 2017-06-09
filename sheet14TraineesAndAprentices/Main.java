package sheet14TraineesAndAprentices;

public class Main {

	/*private static final Trainee Electrition = null;
	private static final Trainee Carpenter = null;
	private static final Trainee SoftwareDeveloper = null;
	private static final Trainee ComputerAidedDesign = null;*/

	public static void main (String [] args) {

		SoftwareDeveloper SoftwareDeveloper = new SoftwareDeveloper("John Smith","01/01/1980",123456);
		
		ComputerAidedDesign ComputerAidedDesign = new ComputerAidedDesign("Will ohms","02/02/1993",12345645);
		
		Carpenter Carpenter = new Carpenter("John Reily","03/03/1991",345899);
		
		Electrician Electrician = new Electrician("Paddy Hill","04/05/1991",987754); 
		
		
		Trainee [] allTrainees = {Electrician,Carpenter,SoftwareDeveloper,ComputerAidedDesign};
		for(Trainee t : allTrainees){
			if(t instanceof Apprentice &&
				((sheet14TraineesAndAprentices.Carpenter)t).getPhase() == Apprentice.PHASE_TWO){
				System.out.println("All aprrentices are in phase two");
				System.out.println("Trainee's name is : " + t.getName() + "Employers name is : " + ((Apprentice)t).getEmployersName());
			}
			
			
		}

		/*Trainee t1 = new Trainee("Stephen Gregan","01/01/1995",123678855);
		System.out.println(t1);

		Electrition e1 = new Electrition();
		System.out.println();

		Carpenter c1 = new Carpenter();
		System.out.println();

		SoftwareDeveloper s1 = new SoftwareDeveloper();
		System.out.println();

		ComputerAidedDesign c2 = new ComputerAidedDesign();
		System.out.println(c2);
*/
	}

}
