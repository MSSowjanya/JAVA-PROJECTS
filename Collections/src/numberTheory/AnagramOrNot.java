package numberTheory;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramOrNot {

	public static void main(String[] args) {
		System.out.println("Enter the numbers");
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int rem=0;
		int count=0;
		int count1=0;
		
		Map<Integer, Integer> m1=new HashMap<Integer, Integer>();
		Map<Integer, Integer> m2=new HashMap<Integer, Integer>();
		
		while(num1>0) {
			rem=num1%10;
			num1=num1/10;
			count++;
			m1.put(rem,(m1.containsKey(rem)?m1.get(rem)+1:1));
		}
		while(num2>0) {
			rem=num2%10;
			num2=num2/10;
			count1++;
			m2.put(rem,(m2.containsKey(rem)?m2.get(rem)+1:1));
		}
		if(count!=count1) {
			System.out.println("Numbers are not Anagram");
		}
		
		if(m1.equals(m2)) {
			System.out.println("Numbers are Anagram");
		}
		else
			System.out.println("Numbers are not Anagram");
		

	}

}
