public class Department {
	String name;

	private Manager manager;
	
	Employee[] employees = new Employee[15];
 	
	
	

	
	public Department(String name, Manager manager, Employee[] employees) {
		this.name = name;
		this.manager = manager;
		this.employees = employees;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	

	public Employee[] getEmployees() {
		return employees;
	}
	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Department [manager=" + manager + ", employees=" + employees + "]";
	}
	
	
}
