package stringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class DuplicatesOccurances {
		public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string");
		String str=scan.next();
		System.out.println(findDuplicatesWithNumberOfOccurances(Str));
	}
	public static Map findDuplicatesWithNumberOfOccurances(String str) {
		Map<Character, Integer> countMap=new HashMap<Character, Integer>();
		Map<Character, Integer> newMap=new HashMap<Character, Integer>();
		for(char ch:str.toCharArray()) {
			countMap.put(ch, countMap.containsKey(ch)?countMap.get(ch)+1:1);
		}
		for(Entry<Character, Integer> entries:countMap.entrySet()) {
			if(entries.getValue()>1)
				newMap.put(, value)
		}
		
	}
	

}
