package numberTheory;

import java.util.Scanner;

public class printBiggerNum {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int greater=0;
		greater=(num1>num2)?num1:num2;
		System.out.println("Greater num: "+greater);
	}

}
