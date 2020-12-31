package arrayPrograms;

import java.util.Scanner;

/**
 * To find avg value from first half
 * @author Divyashree
 *
 */
public class Ass19 {
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
		int sum=0;
		for(int i=0; i<newarraysize;i++) {
			sum+=arr[i];
		}
		System.out.println("The avg of first half: "+sum/newarraysize);	
	}
}
