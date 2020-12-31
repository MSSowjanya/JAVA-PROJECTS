package basicPrograms;

import java.util.Scanner;

public class Factorial {

	static int fact(int num) {
		int res=1;
		for(int i=num; i>=1; i--)
			res=res*i;
		return res;
	}
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println(fact(num));

	}

}
