package numberTheory;

import java.util.Scanner;

public class PrintSmallerNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter three numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		int smaller=0;
		smaller=(num1<num2)?num1:num2;
		smaller=(smaller<num3)?smaller:num3;
		System.out.println("Smaller num is: "+smaller);
	}

}
