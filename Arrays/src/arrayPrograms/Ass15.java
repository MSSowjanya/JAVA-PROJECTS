package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * min of first half of the array
 * @author Divyashree
 *
 */
public class Ass15 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size");
		int arrsize=scan.nextInt();
		System.out.println("Enter the array elements");
		int arr[]=new int[arrsize];
		for(int i=0; i<arrsize;i++) {
			arr[i]=scan.nextInt();
		}
		int newarraysize=arrsize/2;
		int arr1[]=new int[newarraysize];
		for(int i=0; i<newarraysize;i++) {
			arr1[i]=arr[i];
		}
		Arrays.sort(arr1);
		System.out.println(("min in the first half of the array: "+arr1[0]));
	}
}
