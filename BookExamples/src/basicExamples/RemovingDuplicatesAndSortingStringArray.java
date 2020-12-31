package basicExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RemovingDuplicatesAndSortingStringArray {

	public static void main(String[] args) {
		
		String arr[]= {"Google","Facebook","Tesla","Yahoo","Google","Facebook","Tesla","eCommerce","mCommerce"};
		System.out.println("Before removing duplicates");
		System.out.println(Arrays.toString(arr));
		System.out.println("------Before Sorting------");
		Set<String> set=new HashSet<>(Arrays.asList(arr));
		
		
		System.out.println(set);
		//Object[] objs=set.toArray();
		System.out.println("------After Sorting------");
		ArrayList<String> al=new ArrayList<String>(set);
		Collections.sort(al);
	
		System.out.println(al);
		/**
		for(String str:al)
			System.out.println(str);
			**/
		
	}
}
