package stringPrograms;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import javax.swing.SpringLayout.Constraints;

public class CheckDuplicateWordsAndOccurances {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String line=scan.nextLine();
		Map<String, Integer> countDuplicates=new LinkedHashMap<>();
		for(String word:line.split(" ")) {
			countDuplicates.put(word,countDuplicates.containsKey(word)?countDuplicates.get(word)+1:1 );
		}
		for(Entry<String, Integer> entry:countDuplicates.entrySet()){
			if(entry.getValue()>1)
				System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}
	

}
