package strings;

import java.util.Scanner;

public class CharacterOccuranceMain {

	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter String");
			String str=scan.next();
			System.out.println("Enter the character");
			char ch=scan.next().charAt(0);
			System.out.println(CharacterOccurance.count(str,ch));
			
	}

}
