package beans;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public EmployeeDAO employeeDao() {
		EmployeeDaoInMemoryImpl bean = new EmployeeDaoInMemoryImpl();
		return bean;
	}
	
	@Bean(autowire=Autowire.BY_NAME)
	public EmployeeService employeeService() {
		EmployeeServiceImpl bean = new EmployeeServiceImpl(employeeDao());
		return bean;
	}
	
	@Bean
	public EmployeeDAO employeeDaoJpa() {
		EmployeeDaoJpaImpl bean = new EmployeeDaoJpaImpl();
		return bean;
	}
	
}
