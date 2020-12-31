package numberTheory;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		boolean isPrime=true;
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
			else {
				isPrime=true;
			}
		}
			if(isPrime) {
				System.out.println("It is a Prime Number");
			}
			else {
				System.out.println("It is not a Prime Number");
			}
	}

}
