package conversions;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str=scan.nextLine();
		char[] ch=(str.trim().replaceAll("\\s+", "")).toCharArray();
		System.out.println(ch.length);
		char[] ch1=Arrays.copyOfRange(ch, 0, 4);
		System.out.println(Arrays.toString(ch1));
	}

}
