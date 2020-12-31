package numberTheory;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first digit");
		int n1=scan.nextInt();
		System.out.println("Enter the second digit");
		int n2=scan.nextInt();
		System.out.println("Enter the length of series");
		int count=scan.nextInt();
		int n3=0;
		
		for(int i=0;i<count;i++) {
			n3=n1+n2;
			System.out.println(n1);
			n1=n2;
			n2=n3;
		}

	}

}
