package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import dto.IEmployee;

public class EmployeeSalaryInvocationHandler implements InvocationHandler {

	private IEmployee employeeTarget;

	public EmployeeSalaryInvocationHandler(IEmployee employeeTarget) {

		this.employeeTarget = employeeTarget;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (method.getName().equals("giveHike  ")) {

			// pre processong
			double hikeValue = (double) args[0];

			if (hikeValue <= 0.0) {
				throw new RuntimeException("Hike amount in not valid");
			}
		}
		// making actual cal to my service layer
		Object returnValue = method.invoke(employeeTarget, args);

		// post processing

		System.out.println("Executing method : " + method.getName() + " for employee id :" + employeeTarget.getId());

		return returnValue;
	}

}
