package numberTheory;

import java.util.Scanner;

public class ReverseOnlyFirstHalf {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		int temp=num;
		int count=0;
		int rem=0;
		int rev=0;
		int midN=0;
		while(num>0) {
			rem=num%10;
			num=num/10;
			count++;
		}
		for(int i=1; i<=count/2;i++) {
			
			temp=temp/10;
		}
		while(temp>0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println(rev);
	}

}
