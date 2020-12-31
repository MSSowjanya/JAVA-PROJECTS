package javaScenarios;

import java.util.Scanner;

public class GradeBasedOnMarks {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter marks");
		int marks=scan.nextInt();
		if(marks>=85 && marks<=100) {
			System.out.println("Distinction");
		}
		else if(marks>=60 && marks<85)
			System.out.println("First Class");
		else if(marks>=35 && marks<60)
			System.out.println("Pass");
		else if(marks<35)
			System.out.println("Fail");
		else if(marks>100)
			System.out.println("Invalid");

	}

}
