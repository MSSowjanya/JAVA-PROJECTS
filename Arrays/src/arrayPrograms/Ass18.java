package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Ass18 {
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
		int j=0;
		for(int i=newarraysize; i<arr.length;i++) {
			arr1[j]=arr[i];
			j++;
		}
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		System.out.println(("min in the second half of the array: "+arr1[arr1.length-1]));
	}
}
