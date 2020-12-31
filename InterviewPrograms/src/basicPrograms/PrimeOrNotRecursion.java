package basicPrograms;

import java.util.Scanner;

public class PrimeOrNotRecursion {
	static boolean isPrime(int num, int i) {
		if(num<=2)
			return (num==2)?true:false;
		else if(num%i==0)
			return false;
		else if(i*i>num)
			return true;
		return isPrime(num,i+1);
			
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		if(isPrime(num,2))
			System.out.println("Yes");
		else
			System.out.println("No");
		

	}

}
