package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 2nd max element
 * @author Divyashree
 *
 */
public class Ass5 {
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
		int max=arr[arrsize-2];
		System.out.println(Arrays.toString(arr));
		System.out.println("Maximum element in the array:  "+max);
	}
}
