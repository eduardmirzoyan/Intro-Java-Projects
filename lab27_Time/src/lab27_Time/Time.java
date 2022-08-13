package lab27_Time;

public class Time {

	//Fields
	private int hours;
	private int mins;
	private int isMilitary = 0;
	private boolean ifAMPM = false;

	//Constructors
	public Time() {
		hours = 0;
		mins = 0;
		toString();
	}
	
	public Time(int h, int m) {
//		if(h < 0 || m < 0) {
//			throw new IllegalArgumentException(
//			           "Hours or Minutes is under 0");
//		}
		//else {
			hours = h;
			mins = m;
			toString();
		//}
		
	}
	
	//Choice 1: Converts a time object with only minutes, including over 60, to hours and minutes
	public Time(int m) {
		if(m >= 60) {
			for(;m >= 60; hours++) {
				m -= 60;
			}
		}
		mins = m;
		toString();
	}
	
	public Time(int h, int m, boolean isAM) {
		mins = m;
		ifAMPM = true;
		if(isAM == false) {
			hours = h + 12;
		}
		else {
			hours = h;
		}
		toString();
	}

	//Methods
	//Converts the input hours and minutes to either a 24 hour or 12 hour clock system, returns time.
	public String toString() {
		String time = "";
		if(mins < 0) {
			for(;mins < 0; hours--) {
				mins += 60;
			}
		}
		if(mins >= 60) {
			for(;mins >= 60; hours++) {
				mins -= 60;
			}
		}
		if(hours > 24) {
			for(;hours > 24; hours = hours - 24) {}
		}
		if(hours < 0) {
			for(;hours < 24; hours = hours + 24) {}
		}
		if(hours == 24) {
			if(mins > 0) {
				hours = 0;
			}
		}
		time = hours + ":" + mins;
		if(mins == 0) {
			time += 0;
		}
		if(mins <= 9) {
			time = hours + ":0" + mins;
		}
		if(ifAMPM == true) {
			if(hours < 12 && hours >= 1 || hours == 0) {
				if(hours == 0) {
					hours += 12;
				}
				time = hours + ":" + mins;
				if(mins == 0) {
					time += 0;
				}
				if(mins <= 9) {
					time = hours + ":0" + mins;
				}
				time += " AM";
				
			}
			if(hours >= 12 && hours <= 24) {
				if(hours == 12) {
					
				}
				else {
				hours = hours - 12;
				}
				time = hours + ":" + mins;
				if(mins == 0) {
					time += 0;
				}
				if(mins <= 9) {
					time = hours + ":0" + mins;
				}
				time += " PM";
			}
		}
		return time;
	}
	
	//Converts the input time to minutes
	public int toMins() {
		return (hours * 60) + mins;
	}
	
	//Sets if the output should be in 24 hour or 12 hour
	public void setPrintAMPM(boolean isAMPM) {
		ifAMPM = isAMPM;
	}

	//Compares 2 times to see if one is ahead of the other, returns -1, 0 , 1
	public int compareTo(Time t) {
		int time2 = t.toMins();
		int time1 = this.toMins();
		if(time1 < time2) {
			return -1;
		}
		if(time1 > time2) {
			return 1;
		}
		if(time1 == time2) {
			return 0;
		}
		else {
			return 0;
		}
	}

	//Returns the time in minutes ellapsed since the 2 times
	public int elapsedSince(Time t) {
		int time1 = t.toMins();
		int time2 = this.toMins();
		if(time1 <= time2) {
			return time2 - time1;
		}
		if(time1 > time2) {
			return 1440 - (time1 - time2);
		}
		return 0;
	}
	
	
	//Increases the time by 1 minute, rounding if nessesary
	public Time increment(){
		int newMins = mins + 1;
		int newHours = hours;
		if(newMins == 60) {
			newMins = 0;
			newHours++;
			if(newHours == 25) {
				newHours = 0;
			}
		}
		return new Time(newHours, newMins);
	}
	
	//Choice 2: Adds 2 times together by first converting them into minutes
	public Time add(Time t) {
		int Time1 = this.toMins();
		int Time2 = t.toMins();
		int sum = Time1 + Time2;
		return new Time(0, sum);
	}
	
	//Choice 3: Subtracts 2 times together by first converting them into minutes
	public Time subtract(Time t) {
		int Time1 = this.toMins();
		int Time2 = t.toMins();
		int difference = Time1 - Time2;
		return new Time(0, difference);
	}

}
