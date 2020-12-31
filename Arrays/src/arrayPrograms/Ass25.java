package arrayPrograms;

import java.util.Scanner;

/**
 * even indexed in reverse order
 * @author Divyashree
 *
 */
public class Ass25 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size");
		int arrsize=scan.nextInt();
		System.out.println("Enter the array elements");
		
		int arr[]=new int[arrsize];
		for(int i=0; i<arrsize;i++) {
			arr[i]=scan.nextInt();
		}
		for(int i=arr.length-1; i>=0;i--) {
			if(i%2==0)
				System.out.println(arr[i]);
		}

	}

}
