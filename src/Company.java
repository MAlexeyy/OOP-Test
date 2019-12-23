public class Company {
	
	Department[] departments = new Department[5];
	
	public Company(Department[] departments) {
		this.departments = departments;
	}

	public Department[] getDepartments() {
		return departments;
	}

	public void setDepartments(Department[] departments) {
		this.departments = departments;
	}
	
	public String averageSalary() {
		double avg = 0.0;
		int cnt = 0;
		for(Department d: departments) {
			double departmentAvg = 0;
			double departmentBonus = 0;
			int departmentCnt = 0;
			avg += d.getManager().getSalary().getAmount();
			departmentAvg += d.getManager().getSalary().getAmount();
			departmentBonus += d.getManager().getSalary().getYearlyBonus();
			departmentCnt++;
			cnt++;
			for(Employee e: d.getEmployees()) {
				avg += e.getSalary().getAmount();
				departmentAvg += e.getSalary().getAmount();
				departmentBonus += e.getSalary().getYearlyBonus();
				departmentCnt++;
				cnt++;				
			}
			System.out.println("Department " + d.getName() + " average salary is " + departmentAvg/departmentCnt);
			System.out.println("Department " + d.getName() + " average bonus is " + departmentBonus/departmentCnt);
		}
		return "The average salary is " + avg/cnt;
	}
	
	

	
	
	
}
