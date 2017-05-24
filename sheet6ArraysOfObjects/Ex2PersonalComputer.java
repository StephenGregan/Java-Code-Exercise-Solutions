package sheet6ArraysOfObjects;

import sheet5PracticeCreatingClasses.Ex5PersonalComputer;

public class Ex2PersonalComputer {

	public static void main(String[] args) {
		
		//int RAM,int HardDrive,String OperatingSystem,int MonitorSize)
		
		Ex5PersonalComputer ee = new Ex5PersonalComputer(4,500,"Linux",17);
		Ex5PersonalComputer ee1 = new Ex5PersonalComputer(8,500,"Windows 7",22);
		Ex5PersonalComputer ee2 = new Ex5PersonalComputer(16,500,"Windows 10",27);
		Ex5PersonalComputer ee3 = new Ex5PersonalComputer(4,500,"Linux",17);
		
		Ex5PersonalComputer [] mm = {ee,ee1,ee2,ee3};
		
		for(int i = 0;i < mm.length;i++){
			System.out.println(mm[i]);
			
		}
	}

}
