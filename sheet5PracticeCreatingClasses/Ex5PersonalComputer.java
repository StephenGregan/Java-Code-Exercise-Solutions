package sheet5PracticeCreatingClasses;

public class Ex5PersonalComputer {

	private int ram;
	private int hardDrive;
	private String operatingSystem;
	private MonitorSize monitorSize;
	private double cost;

	/*
	int Ram = Ram_4_Gb;
	double HarDrive = 256;
	String OperatingSystem = "Windows 7";
	 double MonitorSize = 22;
	 */

	public static final int Ram_4_Gb = 4;
	public static final int Ram_8_Gb = 8;
	public static final int Ram_16_Gb = 16;
	
	public static final int Hard_Drive_500_Gb = 500;
	public static final int Hard_Drive_1_Tb = 1;
	public static final int Hard_Drive_2_Tb = 2;

	// Public static final String Os_linux = "Linux"; Switch statement is allowed.
	public static final String Os_Linux = "Linux";
	public static final String Os_windows_Solaris = "Solaris";
	public static final String Os_Mac_Leopard = "Mac";
	public static final String Os_Windows_7 = "Windows 7";
	public static final String Os_Windows_10 = "Windows 10";

	/*public static final int Monitor_15 = 15;
	public static final int Monitor_17 = 17;
	public static final int Monitor_19 = 19;
	public static final int Monitor_22 = 22;
	public static final int Monitor_27 = 27;
	public static final int Monitor_32 = 32;
	*/
	public enum MonitorSize {Monitor_15,Monitor_17,Monitor_19,Monitor_22,Monitor_27,Monitor_32};

	// Static block will execute before any constructors are called. Exam will test on this. Does not allow switch statement.
	/*static {

		Os_Linux = "Linux";
		Os_windows_Solaris = "windows Solaris";
		Os_Mac_Leopard = "Mac Leopard";
		Os_Windows_7 = "Windows 7";
		Os_Windows_10 = "Windows 10";

	}*/

	public Ex5PersonalComputer() {
		ram = Ram_4_Gb;
		hardDrive = Hard_Drive_500_Gb;
		operatingSystem = Os_Windows_7;
		//monitorSize = Monitor_17;
		cost = 350.00;

	}

	public Ex5PersonalComputer(int RAM,int HardDrive,String OperatingSystem,int MonitorSize) {
		this();
		setRAM(RAM);
		setHardDrive(HardDrive);
		setOperatingSystem(OperatingSystem);
		//setMonitorSize(MonitorSize);

	}

	public int getRAM() {
		return ram;
	}

	public void setRAM(int ram) {
		if(ram == Ram_4_Gb || ram == Ram_8_Gb || ram == Ram_16_Gb){	
		this.ram = ram;
		}else{
			System.out.println(ram + "is invalid for ram, setting to default");		
		}
	}
	public int getHardDrive() {
		return hardDrive;
	}

	public void setHardDrive(int hardDrive) {
		if(hardDrive == Hard_Drive_1_Tb || hardDrive == Hard_Drive_2_Tb ||
				hardDrive == Hard_Drive_500_Gb){
		this.hardDrive = hardDrive;
		}else{
System.out.println(hardDrive + "is invalid,setting to default");
			
		}
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		if(operatingSystem.equals(Os_Linux) || operatingSystem.equals(Os_Mac_Leopard) ||
				operatingSystem.equals(Os_Windows_10) || operatingSystem.equals(Os_Windows_7) ||
				operatingSystem.equals(Os_windows_Solaris)){
			this.operatingSystem = operatingSystem;
		}else{
			System.out.println("Invalid operating system, setting to default");
		}
	}

	public MonitorSize getMonitorSize() {
		return monitorSize;
	}

	public void setMonitorSize(MonitorSize monitorSize) {
		this.monitorSize = monitorSize;
	}
	
	public double calculateCost(){
	double cost = 350;
	//int RAM;
	if(ram == Ram_8_Gb)
			cost += 20;
	else if(ram == Ram_16_Gb)
				cost += 40;
	
	if(hardDrive == Hard_Drive_1_Tb)
		cost += 60;
	else if(hardDrive == Hard_Drive_2_Tb){
		cost += 80;
		
		if(operatingSystem.equals(Os_Linux) || operatingSystem.equals(Os_windows_Solaris))
			cost -= 20;
		else if(operatingSystem.equals(Os_Windows_10))
				cost += 40;
		else if(operatingSystem.equals(Os_Mac_Leopard))
				cost += 1500;
		
		switch(monitorSize){
		case Monitor_15:
			cost -= 40;
			break;
		case Monitor_19:
			cost -= 20;
			break;
		case Monitor_22:
			cost += 20;
			break;
		case Monitor_27:
			cost += 40;
			break;
		case Monitor_32:
			cost += 60;
			break;
			default:
				cost += 0;
				System.out.println("The default of the switch");
				break;
		}	
	}
	return cost;
	}
	
	@Override
	public String toString(){
	return "\n Pc ram =" + ram + "\nHarDrive =" + hardDrive + 
			(hardDrive == Hard_Drive_500_Gb ? "Gb" : "Tb") +
			"\nOperating System =" + operatingSystem +
			"\nMonitorSize =" + monitorSize.toString().toLowerCase().replace("_"," ")
					.replace("m","M") + "\"" + String.format("\nCost = % .2f", calculateCost());
	}
}




	

