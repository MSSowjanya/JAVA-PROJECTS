package numberTheory;

import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter three numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		int temp;
		if(num1>num2) {
			temp=num1;
			num1=num2;
			num2=temp;	
			System.out.println(num1+","+num2+","+num3);
		}
		if(num2>num3) {
			temp=num2;
			num2=num3;
			num3=temp;
			System.out.println(num1+","+num2+","+num3);
		}
		if(num1>num2) {
			temp=num1;
			num1=num2;
			num2=temp;
		}
		System.out.println(num1+","+num2+","+num3);
	}

}
