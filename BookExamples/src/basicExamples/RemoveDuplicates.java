package basicExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	public static void main(String[] args) {
		char arr[]= {'A','B', 'A','A', 'C','B'};
		Set<Character> set=new HashSet<>();
		for(char i:arr) {
			set.add(i);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(set);
		
		
		//Converting a set to array again
		char arr1[]=new char[set.size()];
		int index=0;
		for(char i:set) {
			//arr1[index++]=((Integer)i).intValue(); 
			arr1[index++]=i;
		}
		System.out.println(Arrays.toString(arr1));
		
	}
}

