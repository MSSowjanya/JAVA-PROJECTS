package basicExamples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesInt {

	public static void main(String[] args) {
		int arr[]= {1,1,2,2,3,4,5,3,1};
		Set<Integer> set=new HashSet<>();
		for(int i:arr) {
			set.add(i);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(set);
		

	}

}
