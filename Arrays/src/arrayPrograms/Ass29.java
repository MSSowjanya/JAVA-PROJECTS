package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;
/** 
 * swap 2 given indexed elements
 * @author Divyashree
 *
 */
public class Ass29 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size");
		int arrsize=scan.nextInt();
		System.out.println("Enter the array elements");
		
		int arr[]=new int[arrsize];
		for(int i=0; i<arrsize;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the index of first element");
		int ind1=scan.nextInt();
		System.out.println("Enter the index of second element");
		int ind2=scan.nextInt();
		System.out.println(Arrays.toString(swap(arr,ind1,ind2)));
	}
	static int[] swap(int[] arr, int ind1, int ind2) {
		int temp=arr[ind1];
		arr[ind1]=arr[ind2];
		arr[ind2]=temp;
		return arr;
	}
}
