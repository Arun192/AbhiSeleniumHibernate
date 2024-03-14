package dto;

import java.lang.reflect.Proxy;

import proxy.EmployeeSalaryInvocationHandler;

public class Client {

	public static void main(String[] args) {

		ITEmployee itEmployee = new ITEmployee();
		itEmployee.setId(101);
		itEmployee.setName("Arun");
		itEmployee.setSalary(30000);

		System.out.println(itEmployee.getSalary());

		EmployeeSalaryInvocationHandler empHandler = new EmployeeSalaryInvocationHandler(itEmployee);

		IEmployee employee = (IEmployee) Proxy.newProxyInstance(ITEmployee.class.getClassLoader(),
				new Class[] { IEmployee.class }, empHandler);
		employee.giveHike(5000);
		System.out.println(employee.getSalary());
	}
}
