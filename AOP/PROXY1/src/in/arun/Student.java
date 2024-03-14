package in.arun;

public class Student implements DailySession {

	private Attendence attendance;

	public Student(Attendence attendance) {

		this.attendance = attendance;
	}

	@Override
	public void attendLession() {

		System.out.println("Attending the session...");

	}

	public Attendence getAttendance() {
		return attendance;
	}

	public void setAttendance(Attendence attendance) {
		this.attendance = attendance;
	}

}
