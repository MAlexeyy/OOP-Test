public class CompanyStatistics {

	public static void main(String[] args) {

		Company company = new Company(utils.generateDepartments());

		System.out.println(company.averageSalary());

	}
}
