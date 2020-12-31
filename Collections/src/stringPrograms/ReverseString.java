package stringPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scan.nextLine();
		StringBuffer str1=new StringBuffer(str);
		str1.reverse();
		String rev=str1.toString();
		System.out.println("Reversed String is: "+rev);

	}

}
