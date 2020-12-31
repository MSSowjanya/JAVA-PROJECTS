package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Reverse odd indexed elements only
 * @author Divyashree
 *
 */
public class Ass34 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size");
		int arrsize=scan.nextInt();
		System.out.println("Enter the array elements");
		
		int arr[]=new int[arrsize];
		for(int i=0; i<arrsize;i++) {
			arr[i]=scan.nextInt();
		}
		int[] revarr=new int[arrsize];
		int j=0;
		for(int i=arrsize-1; i>=0;i--) {
			revarr[j]=arr[i];
			j++;
		}
		int[] arr1=new int[arrsize];
		for(int i=0;i<arrsize;i++) {
			if(i%2==0) {
				arr1[i]=arr[i];
			}
			else
				arr1[i]=revarr[i];
				
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));

	}

}
