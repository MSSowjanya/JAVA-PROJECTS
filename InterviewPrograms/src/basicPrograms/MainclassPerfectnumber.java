package basicPrograms;

import java.util.Scanner;

public class MainclassPerfectnumber {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scan= new Scanner(System.in);
		int num=scan.nextInt();
		if(PerfectNumber.isPerfect(num))
			System.out.println("Perfect Number");
		else
			System.out.println("Not a perfect number");
		
	}

}
