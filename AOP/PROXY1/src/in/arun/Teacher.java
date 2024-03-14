package in.arun;

import java.util.Date;

public class Teacher {

	public static void main(String[] args) {
		
		
		DailySession dailySession = new StudentProxy(new Attendence(new Date(), false));
		dailySession.attendLession();
	}
}
