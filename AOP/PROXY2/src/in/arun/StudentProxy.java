package in.arun;

import javax.management.RuntimeErrorException;

public class StudentProxy extends Student {

	public StudentProxy(Attendence attendance) {
		super(attendance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attendLession() {

		if (!super.getAttendance().isPresent()) {
			throw new RuntimeException("Student is not Present and Can't attend the Lession.");

		}
		super.attendLession();
	}
}
