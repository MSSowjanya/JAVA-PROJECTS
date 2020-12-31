package stringPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstrWithoutRepeatingChars {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scan.nextLine();
		char[] ch=str.toCharArray();
		Set<Character> s=new LinkedHashSet();
		for(int i=0; i<ch.length;i++) {
			s.add(ch[i]);
		}
		System.out.println(s);
		String str1="";
		for(Character ch1:s)
			str1=str1+ch1;
		System.out.println(str1);

	}

}
