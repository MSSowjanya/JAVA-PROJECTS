package arrayPrograms;

import java.util.Scanner;

public class Ass22 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size");
		int arrsize=scan.nextInt();
		System.out.println("Enter the array elements");
		
		int arr[]=new int[arrsize];
		for(int i=0; i<arrsize;i++) {
			arr[i]=scan.nextInt();
		}
		int newarrsize=arrsize/2;
		for(int i=newarrsize-1;i>=0;i--) {
			System.out.println(arr[i]);
		}

	}

}
