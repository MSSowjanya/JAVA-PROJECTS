package numberTheory;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int num=scan.nextInt();
		int temp=num;
		int count=0;
		int rem=0;
		int rev=0;
		while(num>0) {
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
			count++;
		}
		if(rev==temp)
			System.out.println("It is a Palindrome ");
		else
			System.out.println("It is not a Palindrome ");

	}

}
