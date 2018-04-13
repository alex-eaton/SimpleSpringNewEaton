package beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDaoInMemoryImpl implements EmployeeDAO {

	private Map<Long, Employee> employeesMap = new HashMap<Long, Employee>();

	{
		Employee employee1 = new Employee(1L, "John", 10);
		Employee employee2 = new Employee(2L, "Mary", 20);

		employeesMap.put(employee1.getId(), employee1);
		employeesMap.put(employee2.getId(), employee2);
	}

	public void insert(Employee employee) {
		employeesMap.put(employee.getId(), employee);
	}

	public Map<Long, Employee> getemployeesMap() {
		return employeesMap;
	}

	public void setEmployeesMap(Map<Long, Employee> employeesMap) {
		this.employeesMap = employeesMap;
	}

	public void update(Employee employee) {
		employeesMap.put(employee.getId(), employee);
	}

	public void update(List<Employee> employees) {
		for (Employee employee : employees) {
			update(employee);
		}
	}

	public void delete(long employeeId) {
		employeesMap.remove(employeeId);
	}

	public Employee find(long employeeId) {
		return employeesMap.get(employeeId);
	}

	public List<Employee> find(List<Long> employeeIds) {
		List<Employee> employees = new ArrayList<Employee>();
		for (Long id : employeeIds) {
			employees.add(employeesMap.get(id));
		}
		return employees;
	}

	public List<Employee> find(String employeeName) {
		List<Employee> employees = new ArrayList<Employee>();
		for (Employee employee : employeesMap.values()) {
			if (employeeName.equals(employee.getEmployeeName())) {
				employees.add(employee);
			}
		}
		return employees;
	}

	public List<Employee> find(boolean currentEmployee) {
		List<Employee> employees = new ArrayList<Employee>();
		for (Employee employee : employeesMap.values()) {
			if (currentEmployee == (employee.isCurrentEmployee())) {
				employees.add(employee);
			}
		}
		return employees;
	}

}
