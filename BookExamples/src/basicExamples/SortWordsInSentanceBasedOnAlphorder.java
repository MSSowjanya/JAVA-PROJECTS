package basicExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortWordsInSentanceBasedOnAlphorder {

	public static void main(String[] args) {
		String str="today is a bright sunny day";
		String words[]=str.split(" ");
		System.out.println("---------Before Sorting---------");
		System.out.println(Arrays.toString(words));
		ArrayList<String> al=new ArrayList<>(Arrays.asList(words));
		Collections.sort(al);
		System.out.println(al);

	}

}
