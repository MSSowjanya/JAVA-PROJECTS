package stringPrograms;

import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String line=scan.nextLine();
		String withoutSpace=line.trim().replaceAll("\\s+", "");
		System.out.println(withoutSpace);

	}

}
