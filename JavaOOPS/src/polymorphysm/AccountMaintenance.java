package polymorphysm;

public class AccountMaintenance {

	public static void main(String[] args) {
		SavingsAccount acc1=new SavingsAccount(20000);
		acc1.deposit(10000);
		acc1.withdraw(200);
		acc1.balanceEnquiry();
		LoanAccount acc2=new LoanAccount(50000);
		acc2.deposit(20000);
		acc2.balanceEnquiry();

	}

}
