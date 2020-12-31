package arrayPrograms;

import java.util.Scanner;

/**
 * find index of given element
 * @author Divyashree
 *
 */
public class Ass28 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size");
		int arrsize=scan.nextInt();
		System.out.println("Enter the array elements");
		
		int arr[]=new int[arrsize];
		for(int i=0; i<arrsize;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the element");
		int num=scan.nextInt();
		System.out.println(findIndex(arr,num));
		
		

	}
	static int findIndex(int arr[], int num) {
		int i=0;
		for(i=0; i<arr.length;i++) {
			if(num==arr[i])
				break;
			
		}
		return i;
	}

}
