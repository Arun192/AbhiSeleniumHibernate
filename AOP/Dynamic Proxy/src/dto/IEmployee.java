package dto;

public interface IEmployee {

	void giveHike(double amount);

	void payCut(double amount);

	public int getId();

	public void setId(int id);

	public String getName();

	public void setName(String name);

	public double getSalary();

	public void setSalary(double salary);
}
