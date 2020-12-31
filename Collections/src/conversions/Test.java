package conversions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		// Conversion of int to String
		int i=100;
		String str=Integer.toString(i);
		System.out.println(str);
		
		//Conversion of String to int--- Parsing
		int a=Integer.parseInt(str);
		System.out.println(a);
		
		//Conversion of Array to Collection
		
		
		
		//The method shown below doesn't work for primitive arrays
		String[] arr1= {"Divya", "Sathya"};
		List<String> lst1=new ArrayList(Arrays.asList(arr1));
		System.out.println(lst1); //Giving object address not ArrayList elements
		
		for(String ele:lst1) {
			System.out.println(ele);
		}
		
		//Conversion of primitive Array to ArrayList
		int arr[]={1,2,5,7,9};
		List lst=new ArrayList<>();
		for(int k=0; k<arr.length;k++) {
			lst.add(arr[k]);
		}
		System.out.println(lst);
	}

}
