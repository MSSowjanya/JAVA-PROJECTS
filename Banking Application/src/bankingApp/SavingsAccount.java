package bankingApp;

import java.util.Scanner;

public class SavingsAccount extends BankAccount{
	double balance; 
	double 
	SavingsAccount(double Amount){
		balance=Amount;
	}
	void deposit(double Amount) {
		balance=balance+Amount;
		System.out.println("You have successfuly deposited "+ Amount);	
	}
	void withdraw(double Amount) {
		
	}

}
