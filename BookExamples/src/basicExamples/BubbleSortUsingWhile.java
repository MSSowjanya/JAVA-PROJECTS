package basicExamples;

import java.util.Arrays;

public class BubbleSortUsingWhile {

	public static void main(String[] args) {
		int arr[]=new int[] {98,87,75,65,54,43,32,21,15};
		System.out.println("-------before sorting------");
		System.out.println(Arrays.toString(arr));
		
		int temp=0;
		boolean flag=true;
		
		while(flag) {
			flag=false;
			for(int i=0; i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					flag=true;
				}	
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
