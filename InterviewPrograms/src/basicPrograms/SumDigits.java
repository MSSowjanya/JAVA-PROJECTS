package basicPrograms;

import java.util.Scanner;

public class SumDigits {
	public static int sum(int num) {
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		System.out.println("Sum of the digits in given number is: "+sum(num));
	}

}
