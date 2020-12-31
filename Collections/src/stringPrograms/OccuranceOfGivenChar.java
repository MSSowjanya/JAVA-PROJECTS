package stringPrograms;

import java.util.Scanner;

public class OccuranceOfGivenChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		System.out.println("Enter char need to be searched");
		char ch=scan.next().charAt(0);
		System.out.println("number of occurances: "+findOccurances(str,ch));
	}
	public static int findOccurances(String str, char ch) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if (str.charAt(i)==ch){
				count++;
			}
		
		}
		return count;
	}

}
