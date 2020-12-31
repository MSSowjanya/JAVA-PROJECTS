package arrayPrograms;

import java.util.Scanner;

/**
 * Avg value from all even indexed elements
 * @author Divyashree
 *
 */
public class Ass11 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size");
		int arrsize=scan.nextInt();
		System.out.println("Enter the array elements");
		int arr[]=new int[arrsize];
		int sum=0;
		for(int i=0; i<arrsize;i++) {
			if(i%2==0) {
				sum+=arr[i];
			}
		}
	}
}
