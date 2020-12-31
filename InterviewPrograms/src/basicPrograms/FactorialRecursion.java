package basicPrograms;

import java.util.Scanner;

public class FactorialRecursion {
	static int fact(int num) {
		if(num==1||num==0)
			return 1;
		else
			return num*fact(num-1);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println(fact(num));

	}

}
