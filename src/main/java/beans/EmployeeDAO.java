package beans;

import java.util.List;

public interface EmployeeDAO {

	public void insert(Employee employee);
	public void update(Employee employee);
	public void update(List<Employee> employees);
	public void delete(long employeeId);
	public Employee find(long employeeId);
	public List<Employee> find(List<Long> employeeIds);
	public List<Employee> find(String employeeName);
	public List<Employee> find(boolean currentEmployee);
	
}
