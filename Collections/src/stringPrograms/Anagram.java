package stringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String1");
		String str1=scan.next();
		System.out.println("Enter String2");
		String str2=scan.next();
		System.out.println(isAnagram(str1,str2));
	}
	public static boolean isAnagram(String str1, String str2) {
		int n1=str1.length();
		int n2=str2.length();
		if (n1!=n2)
				return false;
		
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for(int i=0; i<n1;i++) {
			if(ch1[i] != ch2[i])
				return false;
		}
		return true;
		
	}
}

