package basicPrograms;

import java.util.Scanner;

public class Swapping2numbers {
	static void swap(int num1, int num2){
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("after swap"+num1+" "+num2);
		
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number num1");
		int num1=s.nextInt();
		System.out.println("enter the number num2");
		int num2=s.nextInt();
		System.out.println("before swap: "+num1+" "+num2 );
		swap(num1, num2);
	}
}
