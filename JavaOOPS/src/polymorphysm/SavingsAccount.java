package polymorphysm;

public class SavingsAccount extends BankAccount{
	double accBal;
	public SavingsAccount(double amt){
		accBal=amt;
	}
	public void deposit(double amt) {
		accBal=accBal+amt;
		System.out.println(amt+"Rs. successfully deposited");
	}
	public void withdraw(double amt) {
		accBal-=amt;
		System.out.println(amt+"Rs. withdrawn");
	}
	public void balanceEnquiry() {
		System.out.println("Available Balance: "+accBal);
	}
	
}
