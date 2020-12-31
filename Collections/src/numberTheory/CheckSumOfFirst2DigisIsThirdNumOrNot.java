package numberTheory;

import java.util.Scanner;

public class CheckSumOfFirst2DigisIsThirdNumOrNot {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		int temp=num;
		int thirdDig=num%10;
		num=num/10;
		
		int sum=0;
		int rem;
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		
		if(sum==thirdDig)
			System.out.println("Third digit is sum of first to digits");
		}

}
