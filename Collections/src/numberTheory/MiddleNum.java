package numberTheory;

import java.util.Scanner;

public class MiddleNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter three numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		int middle=0;
		if ((num1 < num2 && num2 < num3) || (num3 < num2 && num2 < num1)) 
			middle=num2;
		else if ((num2 < num1 && num1 < num3) || (num3 < num1 && num1 < num2)) 
			middle=num1;
		else middle=num3;
		System.out.println("middle no: "+middle);
			
		

	}

}
