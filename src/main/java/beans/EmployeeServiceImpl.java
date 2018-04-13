package beans;

public class EmployeeServiceImpl implements EmployeeService {
	
private EmployeeDAO employeeDao;
	
	public EmployeeDAO getEmployeeDao() {
		return employeeDao;
	}

	public EmployeeServiceImpl() {
		super();
	}

	public EmployeeServiceImpl(EmployeeDAO employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public void setEmployeeDao(EmployeeDAO employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public void giveRaise(long targetEmployeeId, double amount) {
		
		Employee targetEmployee = employeeDao.find(targetEmployeeId);
		
		targetEmployee.setSalary(targetEmployee.getSalary() + amount);
		
		employeeDao.update(targetEmployee);
	}
	
	public void lowerSalary(long employeeId, double amount) throws Exception {
		Employee employee = employeeDao.find(employeeId);
		employee.setSalary(employee.getSalary() - amount);
		employeeDao.update(employee);
	}
	
	public Employee getEmployee(long employeeId) {
		return employeeDao.find(employeeId);
	}
	
}