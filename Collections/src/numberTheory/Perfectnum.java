package numberTheory;

import java.util.Scanner;

public class Perfectnum {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int sum=0;
		int i;
		for(i=1;i<num;i++) {
			if(num%i==0)
				sum=sum+i;
				
		}
		if(sum==num)
			System.out.println("Number is Perfect");
		else
			System.out.println("Number is not Perfect");

	}

}
