package oopsExamples;

abstract class Banking{
	abstract void deposit(double credit);
	abstract void withdraw(double debit);
	abstract void checkBalance();
}
class SavingsAccount extends Banking{
	double balance;
	SavingsAccount(double balance){
		this.balance=balance;
	}
	void deposit(double credit){
		balance+=credit;
	}
	void withdraw(double debit){
		balance-=debit;
	}
	void checkBalance(){
		System.out.println(balance);
	}
}
public class Transaction {

	public static void main(String[] args) {
		SavingsAccount sa=new SavingsAccount(8000.00);
		sa.deposit(1000);
		sa.withdraw(500);
		sa.checkBalance();
	}
}
