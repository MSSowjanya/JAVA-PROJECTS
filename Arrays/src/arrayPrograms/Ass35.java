package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * swap odd indexed elements with its immediate next even indexed elements
 * @author Divyashree
 *
 */
public class Ass35 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size");
		int arrsize=scan.nextInt();
		System.out.println("Enter the array elements");
		
		int arr[]=new int[arrsize];
		for(int i=0; i<arrsize;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		for(int i=1; i<arrsize;i+=2) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		System.out.println(Arrays.toString(arr));

	}

}
