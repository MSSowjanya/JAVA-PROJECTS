package stringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class RotateStringWordwise {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String line=scan.nextLine();
		String[] arr=line.split(" ");
		String[] arr1=new String[arr.length];
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length;i++) {
			if (i==arr.length-1)
				arr1[i]=arr[0];
			else
				arr1[i]=arr[i+1];
		}
		String rotated="";
		for(int i=0; i<arr1.length;i++) {
			rotated=rotated+" "+arr1[i];
		}
		System.out.println(rotated);

	}

}
