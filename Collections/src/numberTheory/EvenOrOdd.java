package numberTheory;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		int num1=scan.nextInt();
		
		if(num1%2==0) {
			System.out.println("Even");
		}
		else
			System.out.println("False");
	}

}
