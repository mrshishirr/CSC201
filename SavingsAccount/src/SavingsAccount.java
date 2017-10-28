// Student: Mahbub Rahman

public class SavingsAccount {
	private static float annualInterestRate;
	private float savingsBalance;
	
	public SavingsAccount() {
		this(0.0f); // 0.0 is treated as double
	}
	
	public SavingsAccount(float savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	
	public float getSavingsBalance() {
		return savingsBalance;
	}
	
	public void setSavingsBalace(float savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	
	public void calculateMonthlyInterest() {
		savingsBalance = savingsBalance + ((savingsBalance * (annualInterestRate / 100)) / 12);
	}
	
	
	public static float getAnnualInterest() {
		return annualInterestRate;
	}
	
	public static void modifyInterestRate(float annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate; // this keyword is not allowed in static
	}
	
	
	
}
