package stringPrograms;

import java.util.Scanner;

public class RotateOnce {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String");
		String str=scan.next();
		System.out.println(rotate(str));
	}
	public static String rotate(String str) {
		char[] arr=str.toCharArray();
		char[] arr1=new char[arr.length];
		for(int i=0; i<arr.length; i++) {
			if(i==arr.length-1)
				arr1[i]=arr[0];
			else 
				arr1[i]=arr[i+1];
		}
		arr=arr1;
		String str1=new String(arr);
		return str1;
		
	}
}
