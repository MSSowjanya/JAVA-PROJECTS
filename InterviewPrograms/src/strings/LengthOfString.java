package strings;

import java.util.Scanner;

public class LengthOfString {
	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		System.out.println(getLength(str));
	}
	public static int getLength(String str) {
		int length=0;
		char[] strCharArray=str.toCharArray();
		for(char C: strCharArray) {
			length++;
		}
		return length;
	}

}
