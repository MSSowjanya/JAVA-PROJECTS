package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Right shift
 * @author Divyashree
 *
 */
public class Ass36 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size");
		int arrsize=scan.nextInt();
		System.out.println("Enter the array elements");
		
		int arr[]=new int[arrsize];
		for(int i=0; i<arrsize;i++) {
			arr[i]=scan.nextInt();
		}
		
		int newarr[]=new int[arrsize];
		for(int i=0; i<arrsize;i++) {
			if(i==arrsize-1)
				newarr[i]=arr[0];
			else
				newarr[i]=arr[i+1];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newarr));

	}

}
