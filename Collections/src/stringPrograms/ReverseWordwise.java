package stringPrograms;

import java.util.Scanner;

public class ReverseWordwise {
	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		System.out.println(reverseWordwise(str));
	}
	public static String reverseWordwise(String str) {
		String rev="";
		String arr[]=str.split(" ");
		for(int i=0; i<arr.length;i++) {
			StringBuffer buff=new StringBuffer(arr[i]);
			rev=rev+buff.reverse().toString()+" ";
		}
		return rev;
	}

}
