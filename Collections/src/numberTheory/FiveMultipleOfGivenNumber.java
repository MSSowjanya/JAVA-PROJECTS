package numberTheory;

import java.util.Scanner;

public class FiveMultipleOfGivenNumber {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		int num1=scan.nextInt();
		for(int i=1; i<=5; i++) {
			System.out.println(num1*i);
		}
		

	}

}
