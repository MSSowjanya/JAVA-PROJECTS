package stringPrograms;

import java.util.Scanner;

public class ReverseStringwithRecursion {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String data=scan.nextLine();
		System.out.println(reverse(data));
	}
	public static String reverse(String data) {
		if (data.isEmpty())
            return data;
        return reverse(data.substring(1)) +data.charAt(0);
	}

}
