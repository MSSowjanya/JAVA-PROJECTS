package basicExamples;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]=new int[] {98,87,75,65,54,43,32,21,15};
		System.out.println("-------before sorting------");
		System.out.println(Arrays.toString(arr));
		
		int temp=0;
	
		for(int i=0; i<arr.length-1;i++) {
			for(int j=0; j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}	
		}
		System.out.println("-------- After Sorting--------");
		System.out.println(Arrays.toString(arr));
	}

}
