package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Ass32 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size(even)");
		int arrsize=scan.nextInt();
		System.out.println("Enter the array elements");
		
		int arr[]=new int[arrsize];
		for(int i=0; i<arrsize;i++) {
			arr[i]=scan.nextInt();
		}
		
		int newarraysize=arrsize/2;
		int arr1[]=new int[newarraysize];
		int j=0;
		for(int i=arrsize-1;i>=newarraysize;i--) {
			arr1[j]=arr[i];
			j++;
		}
		arr=arr1;
		System.out.println(Arrays.toString(arr));

	}

}
