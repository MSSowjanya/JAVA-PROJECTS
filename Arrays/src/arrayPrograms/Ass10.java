package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * max value from odd indexed elements
 * @author Divyashree
 *
 */
public class Ass10 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size");
		int arrsize=scan.nextInt();
		System.out.println("Enter the array elements");
		int sum=0;
		int j=0;
		int evenNum=(arrsize/2)+1;
		int arr1[]=new int[evenNum];
		int arr[]=new int[arrsize];
		for(int i=0; i<arrsize;i++) {
			arr[i]=scan.nextInt();
			if(i%2!=0) {
				arr1[j]=arr[i];
				j++;
			}	
		}
		Arrays.sort(arr1);
		int max=arr1[arr1.length-1];
		System.out.println(Arrays.toString(arr1));
		System.out.println("Minimum element: "+max);
	}
}
