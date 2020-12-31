package numberTheory;

import java.util.Scanner;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println(fact(num));
	}
	static int fact(int num) {
		if(num==0) {
			return 1;
		}
		else {
			return(num*fact(num-1));
		}
	}
}
