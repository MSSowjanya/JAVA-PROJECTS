package arrayPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * To find sum of Array elements
 * @author Divyashree
 *
 */
public class Ass1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size");
		int arrsize=scan.nextInt();
		System.out.println("Enter the array elements");;
		int sum=0;
		int arr[]=new int[arrsize];
		for(int i=0; i<arrsize;i++) {
			arr[i]=scan.nextInt();
			sum+=arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Sum of array elements: "+sum);
	}
}
