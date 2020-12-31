package basicPrograms;

import java.util.Scanner;

public class MainClassPalindrome {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		if(PalindromeRecursion.reverse(num))
			System.out.println("Given number is a Palindrome");
		else
			System.out.println("Given number is not a Palindrome");
			

	}

}
