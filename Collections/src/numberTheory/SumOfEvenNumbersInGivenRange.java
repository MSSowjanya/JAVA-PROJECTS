package numberTheory;

import java.util.Scanner;

public class SumOfEvenNumbersInGivenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the range");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int sum=0;
		for(int i=num1; i<=num2; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
