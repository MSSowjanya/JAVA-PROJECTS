package numberTheory;

import java.util.Scanner;

public class Armstrong {

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
		while (temp>0){
			int rem=temp%10;	
			int m=1;
			for(int i=1; i<=count; i++) {
				m=m*rem;
			}
			sum=sum+m;
			temp=temp/10;
		}
		if(sum==num)
			isArmstrong=true;
		return isArmstrong;
	}
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enetr the number");
		int num=scan.nextInt();
		if(check(num))
			System.out.println(num+ "is an Armstrong Number");
		else
			System.out.println(num+ "is not an Armstrong Number");
	}
	

}
