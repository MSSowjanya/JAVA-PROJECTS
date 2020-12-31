package numberTheory;

import java.util.Scanner;

public class OddNumbersBetweenGivenNumbers {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the range");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		for(int i=num1; i<=num2; i++) {
			if(i%2!=0)
				System.out.println(i);
				
		}

	}

}
