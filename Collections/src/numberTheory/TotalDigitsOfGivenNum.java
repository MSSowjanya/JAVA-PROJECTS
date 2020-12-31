package numberTheory;

import java.util.Scanner;

public class TotalDigitsOfGivenNum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int num=scan.nextInt();
		int count=0;
		int rem=0;
		while(num>0) {
			rem=num%10;
			num=num/10;
			count++;
		}
		System.out.println("count: "+count);
	}

}
