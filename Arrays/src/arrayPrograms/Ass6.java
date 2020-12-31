package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Average value
 * @author Divyashree
 *
 */
public class Ass6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size");
		int arrsize=scan.nextInt();
		System.out.println("Enter the array elements");
		int sum=0;
		int arr[]=new int[arrsize];
		for(int i=0; i<arrsize;i++) {
			arr[i]=scan.nextInt();
			sum+=arr[i];
		}
		int avg=sum/arrsize;
		System.out.println(Arrays.toString(arr));
		System.out.println("Average of the array: "+avg);
	}
}
