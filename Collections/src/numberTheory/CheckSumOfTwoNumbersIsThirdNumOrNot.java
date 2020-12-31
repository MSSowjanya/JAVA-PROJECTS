package numberTheory;

import java.util.Scanner;

public class CheckSumOfTwoNumbersIsThirdNumOrNot {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter three numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		if((num1+num2)==num3)
			System.out.println("True");
	}

}
