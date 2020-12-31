package stringPrograms;

import java.util.Scanner;

public class CheckOneStringIRotationOfOther {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String line=scan.nextLine();
		System.out.println("Enter the second sentence");
		String line2=scan.nextLine();
		char[] line2ch=line2.toCharArray();
		char temp[]=new char[line2ch.length];
		//if(line.length()!=line2.length()) {
			
		//}
			
		for(int i=0; i<line2.length();i++) {
			if(i==line2.length()-1)
				temp[i]=line2ch[0];
			else temp[i]=line2ch[i+1];
		}
		String rotated="";
		for(int i=0;i<temp.length;i++) {
			rotated=rotated+temp[i];
		}
		if(rotated.equals(line))
			System.out.println("line2 is rotation of line1");
		else
			System.out.println("line2 is not the rotation of line1");
	}

}
