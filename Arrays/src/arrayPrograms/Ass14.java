package arrayPrograms;

import java.util.Scanner;

/**
 * sum of elements from second half of array
 * @author Divyashree
 *
 */
public class Ass14 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size");
		int arrsize=scan.nextInt();
		System.out.println("Enter the array elements");
		int arr[]=new int[arrsize];
		for(int i=0; i<arrsize;i++) {
			arr[i]=scan.nextInt();
		}
		int arsize1=0;
		int sum=0;
		if(arrsize%2==0) {
			arsize1=arrsize/2;
			for(int i=arsize1; i<arrsize;i++) {
				sum+=arr[i];
			}
			System.out.println("The sum of second half of the elements is: "+sum);
		}	
		else {
			System.out.println("can't be equally devided");
		}
	}
}
