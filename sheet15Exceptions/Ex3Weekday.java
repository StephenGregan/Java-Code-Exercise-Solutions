package sheet15Exceptions;

public class Ex3Weekday {

	/*private String [] weekday = {"MONDAY","TUESDAY","WEDNESDAY","THURSDAY",
								"FRIDAY","SATURDAY","SUNDAY"};
	*/
	private String monday = "1";
	private String tuesday = "2";
	private String wednesday = "3";
	private String thursday = "4";
	private String friday = "5";
	private String saturday = "6";
	private String sunday = "7";
	private String weekday;
	
	public Ex3Weekday (){
		
		
	}
	
	public Ex3Weekday (String weekday) throws Ex3InvalidWeeklyException{
		this.weekday = weekday;
		
	}

	public String getWeekday() {
		return weekday;
	}

	public void setWeekday(String weekday) throws Ex3InvalidWeeklyException {
		if(weekday.equals("FRIDAY")){
		this.weekday = weekday;
		}else{
			throw new Ex3InvalidWeeklyException ("Sorry you provided a invalid weekday");
			
			
		}
	}
	
	
}
