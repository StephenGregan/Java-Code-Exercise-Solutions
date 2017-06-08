package sheet15Exceptions;

public class Ex2ClockClass {

	private int hours;
	private int minutes;
	private int seconds;

	public Ex2ClockClass() {

	}

	public Ex2ClockClass(int hours,int minutes,int seconds) throws Ex2InvalidTimeException {
		setHours(hours);
		setMinutes(minutes);
		setSeconds(seconds);
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) throws Ex2InvalidTimeException {
		if(hours < 24) {
			this.hours = hours;
		}else{
			throw new Ex2InvalidTimeException("Invalid hours");
			//this.hours = hours % 24;	
		}
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) throws Ex2InvalidTimeException {
		if(minutes < 60) {
			this.minutes = minutes;
		}else{
			throw new Ex2InvalidTimeException("Invalid minutes");
			/*int countIncrease = 0;
			countIncrease = minutes / 60;
			this.minutes = minutes % 60;
			hours += countIncrease;*/
		}
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) throws Ex2InvalidTimeException {
		if(seconds < 60){
			this.seconds = seconds;
		}else{
			throw new Ex2InvalidTimeException("Invalid seconds");
			/*int countIncrease = 0;
			countIncrease = seconds / 60;
			this.seconds = seconds % 60;
			minutes += countIncrease;
			setMinutes(minutes);*/
		}
	}

	@Override
	public String toString() {
		return "Hours : " + hours + ", minutes : " + minutes + ", seconds :" + seconds;
	}
	
	public int incrementHours(int addHours) throws Ex2InvalidTimeException {
		hours += addHours;
		setHours(hours);
		return hours;
	}

	public int incrementMinutes(int addMinutes) throws Ex2InvalidTimeException {
		minutes += addMinutes;
		setMinutes(minutes);
		return minutes;
	}

	public int incrementSeconds(int addSeconds) throws Ex2InvalidTimeException {
		seconds += addSeconds;
		setSeconds(seconds);	
		return seconds;
	}

	public void reset() {
		//hours = minutes = seconds = 0;
		hours = 0;
		minutes = 0;
		seconds = 0;
	}
}
