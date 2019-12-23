import java.util.Random;


public class utils {
	static Random random = new Random();

	private enum type {
		SALES, FINANCE, ADMINISTRATION, ENGINEERING, MARKETING
	}

	public static double generateSalary() {
		return random.nextInt(49000) + 1000;
	}

	public static double generateManagerSalary() {
		return random.nextInt(25000) + 25000;
	}

	public static int generateBonus() {
		return random.nextInt(10000);
	}

	public static int generateAge() {
		return random.nextInt(40) + 20;
	}

	public static String generateDepartmentName() {
		return type.values()[random.nextInt(type.values().length)].toString();
	}

	public static Employee[] generatEmployees() {

		Employee[] employees = new Employee[15];

		for (int i = 0; i < employees.length; i++) {
			employees[i] = new Employee("Employee" + i, utils.generateAge(),
					new Salary(utils.generateSalary(), utils.generateBonus()));
		}
		return employees;
	}
	
	public static Department[] generateDepartments() {
		Department[] departments = new Department[5];
		
		for (int i = 0; i<departments.length;i++) {
			Department department = new Department(generateDepartmentName(),
					new Manager("Manager"+i, generateAge(),
							new Salary(generateManagerSalary(), generateBonus())),
					generatEmployees());
			departments[i] = department;
		}
		return departments;
	}
}
