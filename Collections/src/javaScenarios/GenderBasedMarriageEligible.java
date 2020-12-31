package javaScenarios;

import java.util.Scanner;

public class GenderBasedMarriageEligible {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Gender: If male enter 1 or if female enter 2");
		int gen=scan.nextInt();
		System.out.println("Enter the Age");
		int age=scan.nextInt();
		if(gen==1 && age>21)
			System.out.println("Eligible for Marriage");
		else if(gen==2 && age>18)
			System.out.println("Eligible for Marriage");
		else
			System.out.println("Not eligible for marriage");

	}

}
