package beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans/beans.xml");
		
		EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
		
		System.out.println("Before raise");
		System.out.println("Employee 1 salary: " + employeeService.getEmployee(1).getSalary());
		System.out.println("Employee 2 salary: " + employeeService.getEmployee(2).getSalary());

		employeeService.giveRaise(1,  2);
		
		System.out.println("After raise");
		System.out.println("Employee 1 Salary: " + employeeService.getEmployee(1).getSalary());
		
		applicationContext.close();
	}

}
