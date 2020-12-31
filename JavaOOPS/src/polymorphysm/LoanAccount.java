package polymorphysm;

public class LoanAccount {
	double accBal;
	public LoanAccount(double amt) {
		accBal=amt;
	}
	public void deposit(double amt) {
		accBal-=amt;
		System.out.println(amt+"deposited to your account");
	}
	public void withdraw(double amt) {
		accBal+=amt;
		System.out.println(amt+"withdrawn from your account");
	}
	public void balanceEnquiry() {
		System.out.println("Available Balance: "+accBal);
	}

}
