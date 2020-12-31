package stringPrograms;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		System.out.println("Number of words are: "+count(str));
	}
	public static int count(String str) {
		String arr[]=str.split(" ");
		return arr.length;
	}

}
