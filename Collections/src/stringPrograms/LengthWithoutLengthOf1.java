package stringPrograms;

import java.util.Scanner;

public class LengthWithoutLengthOf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String");
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		System.out.println(getLength(str));
	}
	public static int getLength(String str) {
		int length=0;
		char[] charArr=str.toCharArray();
		for(char c:charArr) {
			length++;
			
		}
		return length;
	}

}
