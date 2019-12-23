
public class Salary {
	private double amount;
	private int yearlyBonus;
	
	
	public Salary(double amount, int yearlyBonus) {
		this.amount = amount;
		this.yearlyBonus = yearlyBonus;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public int getYearlyBonus() {
		return yearlyBonus;
	}


	public void setYearlyBonus(int yearlyBonus) {
		this.yearlyBonus = yearlyBonus;
	}


	@Override
	public String toString() {
		return "Salary [amount=" + amount + ", yearlyBonus=" + yearlyBonus + "]";
	}
	
	
	
}
