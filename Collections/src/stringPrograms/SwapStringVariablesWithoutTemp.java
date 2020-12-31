package stringPrograms;

import java.util.Scanner;

public class SwapStringVariablesWithoutTemp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String str1=scan.nextLine();
		System.out.println("Enter the second String");
		String str2=scan.nextLine();
		System.out.println(str1+", "+str2);
		str1=str1+str2;
		System.out.println(str1);
		str2=str1.substring(0,(str1.length()-str2.length()));
		str1=str1.substring(str2.length());
		System.out.println(str1+", "+str2);
		
	}

}
