package numberTheory;

import java.util.Scanner;

public class GivenNumPrimeOrNot {
	static int rem=0;
	
	static boolean isPrime(int num) {
		int count=num/2;
		for(int i=2;i<=count;i++) {
			rem=num%i;
			if(rem==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number need to be checked");
		int num=s.nextInt();

		if(isPrime(num))
			System.out.println(num+" is a Prime Number");
		else
			System.out.println(num+" is not a Prime Number");
		

	}
}
