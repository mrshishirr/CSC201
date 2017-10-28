// Student: Mahbub Rahman

public class SavingsAccountTest {

	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		
		SavingsAccount.modifyInterestRate(4);
		
		System.out.printf("1st saver deposit: %.2f%n", saver1.getSavingsBalance() );
		System.out.printf("2nd saver deposit: %.2f%n", saver2.getSavingsBalance() );
		System.out.printf("Interest rate: %.2f%%", SavingsAccount.getAnnualInterest());
		
		for (int i=1; i<=12; i++) {
			
			saver1.calculateMonthlyInterest();
			System.out.printf("%n%nMonth %-1d balance for 1st saver: %.2f", i, saver1.getSavingsBalance() );
			
			saver2.calculateMonthlyInterest();
			System.out.printf("%nMonth %-1d balance for 2nd saver: %.2f", i, saver2.getSavingsBalance() );			
		}
		
		SavingsAccount.modifyInterestRate(5);
		System.out.printf("%n%nNew Interest rate: %.2f%%", SavingsAccount.getAnnualInterest());


		saver1.calculateMonthlyInterest();
		System.out.printf("%n%nNext month's balance for 1st saver: %.2f", saver1.getSavingsBalance() );
		
		saver2.calculateMonthlyInterest();
		System.out.printf("%nNext month's balance for 2nd saver: %.2f", saver2.getSavingsBalance() );
		

	}

}
