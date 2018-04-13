package beans;

public interface EmployeeService {

	public void giveRaise(long targetEmployeeId, double amount);
	public void lowerSalary(long employeeId, double amount) throws Exception;
	public Employee getEmployee(long employeeId);
	
}
