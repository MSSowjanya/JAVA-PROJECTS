package stringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstRepeatedAndNonRepeated {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scan.nextLine();
		Map<Character, Integer> charCountMap=new HashMap<Character, Integer>();
		for(char ch:str.toCharArray()) {
			if(charCountMap.containsKey(ch)) {
				charCountMap.put(ch, charCountMap.get(ch)+1);
			}
			else {
				charCountMap.put(ch, 1);
			}		
		}
		//checking for first non repeated character
		for(char ch:str.toCharArray()) {
			if(charCountMap.get(ch)==1) {
				System.out.println("First non-repeated character: "+ch);
				break;
			}			
		}
		for(char ch:str.toCharArray()) {
			if(charCountMap.get(ch)>1) {
				System.out.println("First repeated character: "+ch);
				break;
			}			
		}

	}

}
