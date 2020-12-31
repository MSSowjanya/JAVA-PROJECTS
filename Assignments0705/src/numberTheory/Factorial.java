package numberTheory;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int fact=1;
		for(int i=num; i>=1; i--) {
			fact=fact*num;
			num--;
		}
		System.out.println(fact);
	}

}
