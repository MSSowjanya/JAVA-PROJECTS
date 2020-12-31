package stringPrograms;

import java.util.Scanner;

public class CountNoOfWords {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String line=scan.nextLine();
		String[] words=line.split(" ");
		int noOfWords=words.length;
		System.out.println(noOfWords);

	}

}
