package basicPrograms;

import java.util.Scanner;

public class ReverseNumber {
	static int reverse(int num) {
		int rev=0;
		while (num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		ReverseNumber ref=new ReverseNumber();
		System.out.println("Reverse of the given number is: "+reverse(num));

	}

}
