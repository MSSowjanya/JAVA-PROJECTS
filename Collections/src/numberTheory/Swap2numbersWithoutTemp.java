
package numberTheory;

import java.util.Scanner;

public class Swap2numbersWithoutTemp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println(num1+","+num2);

	}

}
