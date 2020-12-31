package basicPrograms;

import java.util.Scanner;

public class Trial {
	static boolean check(int num) {
		int temp=num;
		int count=0;
		int sum=0;
		boolean isArmstrong=false;
		//Count the number of digits
		while(temp>0) {
			count++;
			temp=temp/10;
		}
		temp=num;
		//
		while(temp>0){
			int rem=temp%10;
			sum=sum+power(rem, count);
			temp=temp/10;
		}
		if(sum==num)
			isArmstrong=true;
		return isArmstrong;	
	}
	public static int power(int n, int p) {
		int m=1;
		for(int i=1; i<=p; i++)
			m=m*n;
		return m;
		
	}
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enetr the number");
		int num=scan.nextInt();
		if(check(num))
			System.out.println("Given number is an Armstrong number");
		else
			System.out.println("Given number is not an Armstrong number");
	}

}
