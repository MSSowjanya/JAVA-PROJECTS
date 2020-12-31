package basicPrograms;

import java.util.Scanner;

public class SumOfDigitsRecursion {
	int rem=0;
	int sum=0;
	public int sumDigits(int num) {
		
		if(num==0)
			return sum;
		else {
			rem=num%10;
			sum=sum+rem;
			sumDigits(num/10);
		}	
		return sum;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		SumOfDigitsRecursion obj=new SumOfDigitsRecursion();
		System.out.println(obj.sumDigits(num));
		
		

	}

}
