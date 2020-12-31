package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program to find minimum element in an array
 * @author Divyashree
 *
 */
public class Ass2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size");
		int arrsize=scan.nextInt();
		System.out.println("Enter the array elements");
		int arr[]=new int[arrsize];
		for(int i=0; i<arrsize;i++) {
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		int min=arr[0];
		System.out.println(Arrays.toString(arr));
		System.out.println("Minimum element in the array:  "+min);
	}
}
