package stringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class CountOfOccuranceOfEachCharacter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String line=scan.nextLine();
		Map<Character, Integer> count=new HashMap<>();
		for(Character ch:line.toCharArray()) {
			count.put(ch, count.containsKey(ch)?count.get(ch)+1:1);
		}
		for(Entry<Character, Integer> entry:count.entrySet()){
				System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}

}
