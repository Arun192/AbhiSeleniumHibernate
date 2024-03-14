package in.arun;

import java.util.Date;

public class Attendence {

	private Date date;
	private boolean isPresent;

	public Attendence(Date date, boolean isPresent) {

		this.date = date;
		this.isPresent = isPresent;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isPresent() {
		return isPresent;
	}

	public void setPresent(boolean isPresent) {
		this.isPresent = isPresent;
	}

}
