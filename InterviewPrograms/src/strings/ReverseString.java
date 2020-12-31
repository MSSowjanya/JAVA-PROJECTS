package strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scan.nextLine();
		StringBuffer str1=new StringBuffer(str);
		str1.reverse();
		String rev=str1.toString();
		if(str.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		
	
	}

}
