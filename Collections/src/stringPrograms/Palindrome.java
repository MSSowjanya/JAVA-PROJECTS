package stringPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("enter string");
		String str=scan.next();
		System.out.println(isPalindrome(str));
	}
	public static boolean isPalindrome(String str) {
		String temp=str;
		StringBuffer buff=new StringBuffer(temp);
		String rev=buff.reverse().toString();
		return str.equals(rev);
	}

}
