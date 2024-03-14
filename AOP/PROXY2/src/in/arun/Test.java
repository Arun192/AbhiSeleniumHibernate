package in.arun;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

public class Test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class<?> studentInfo = Class.forName("in.arun.Student");
		Student student = (Student)studentInfo.newInstance();
		
		
//		Constructor<?>[] constructor = studentInfo.getConstructors();
//		for (Constructor contruct : constructor) {
//			System.out.println(contruct);
//		}
//		Method[] declaredMethods = studentInfo.getDeclaredMethods();
//		for (Method method : declaredMethods) {
//
//			System.out.println(method);
//		}
		
		Class[] methodArgsType =new Class[] {Integer.class};
		Method method = studentInfo.getDeclaredMethod("attendLession", methodArgsType);
		method.invoke(student, 101);
		
		Method method2 = studentInfo.getDeclaredMethod("attendLession");
		method2.invoke(student, null);
	}
}
