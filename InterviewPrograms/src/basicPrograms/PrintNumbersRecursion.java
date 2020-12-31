package basicPrograms;

import java.util.Scanner;

public class PrintNumbersRecursion {
	static void print(int num) {
		if(num<=10)
			System.out.print(num++ + " ");
		print(num);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the initial number");
		int num=scan.nextInt();
		print(num);
	}

}
