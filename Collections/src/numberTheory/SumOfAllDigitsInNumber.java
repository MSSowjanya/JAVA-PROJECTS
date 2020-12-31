package numberTheory;

import java.util.Scanner;

public class SumOfAllDigitsInNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int num=scan.nextInt();
		int count=0;
		int rem=0;
		int sum=0;
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
			count++;
		}
		System.out.println("sum: "+sum);

	}

}
