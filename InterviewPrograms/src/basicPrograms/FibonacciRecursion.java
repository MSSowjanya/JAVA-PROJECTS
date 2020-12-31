package basicPrograms;

import java.util.Scanner;

public class FibonacciRecursion {
	static int num3=0;
	static void print(int num1, int num2, int count) {
		if(count>0) {
			num3=num1+num2;
			System.out.println(num1);
			num1=num2;
			num2=num3;
			count--;
			print(num1,num2,count);
		}
			
			
			
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first digit");
		int n1=scan.nextInt();
		System.out.println("Enter the second digit");
		int n2=scan.nextInt();
		System.out.println("Enter the length of series");
		int count=scan.nextInt();
		print(n1,n2,count);

	}

}
