package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Sum of even indexed elements in an array
 * @author Divyashree
 *
 */
public class Ass7 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size");
		int arrsize=scan.nextInt();
		System.out.println("Enter the array elements");
		int sum=0;
		int arr[]=new int[arrsize];
		for(int i=0; i<arrsize;i++) {
			arr[i]=scan.nextInt();
			if(i%2==0) {
				sum+=arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Average of the array: "+sum);
	}
}
