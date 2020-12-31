package bankingApp;

import java.util.Scanner;

public class AccountMaintenance {

	public static void main(String[] args) {
		System.out.println("Enter the balance of account");
		Scanner scan=new Scanner(System.in);
		double netBalance=scan.nextDouble();
		
		System.out.println("Enter the amount to be deposited");
		Scanner scan1=new Scanner(System.in);
		double depAmount=scan1.nextDouble();
		
		SavingsAccount acc1= new SavingsAccount(depAmount);
		acc1.deposit(depAmount);
		
		System.out.println("Enter the amount to be withdrawn");
		Scanner scan=new Scanner(System.in);
		double withdrawAmount=scan.nextDouble();
		acc1.withdraw(withdrawAmount);
		
	}

}
