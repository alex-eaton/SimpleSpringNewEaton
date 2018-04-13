package beans;

public class Employee {

	private long id;
	private String employeeName;
	private double salary;
	private boolean currentEmployee;
	
	public Employee(){
		
	}
	
	public Employee(long id, String employeeName, double salary) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isCurrentEmployee() {
		return currentEmployee;
	}
	public void setCurrentEmployee(boolean currentEmployee) {
		this.currentEmployee = currentEmployee;
	}
	
	
}
