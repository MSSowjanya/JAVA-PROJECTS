package arrayPrograms;

import java.util.Scanner;

/**
 * sum of elements from first half of array
 * @author Divyashree
 *
 */
public class Ass13 {
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
		if(arrsize%2==0) 
			arsize1=arrsize/2;
		else {
			System.out.println("can't be equally devided");
		}
		for (int i=0; i<arsize1; i++) {
			sum+=arr[i];
		}
		System.out.println("The sum of first half of the elements is: "+sum);
	}
}
