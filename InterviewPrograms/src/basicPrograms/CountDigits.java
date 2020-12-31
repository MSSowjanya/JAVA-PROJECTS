package basicPrograms;

import java.util.Scanner;

public class CountDigits {
	public static int count(int num) {
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
			
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		System.out.println("count of digits in the given number is: "+count(num));

	}

}
