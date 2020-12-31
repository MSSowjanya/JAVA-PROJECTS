package numberTheory;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] arr= {5,4,3,2,1,6};
		int[] arr1=new int[arr.length];
		for(int i=0; i<=arr.length-1;i++) {
			arr1[i]=arr[(arr.length-1)-i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
	}

}
