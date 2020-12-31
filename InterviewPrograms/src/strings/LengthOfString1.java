package strings;

import java.util.Scanner;

public class LengthOfString1 {

	public static void main(String[] args) {
			System.out.println("Enter String");
			Scanner scan=new Scanner(System.in);
			String str=scan.next();
			System.out.println(getLength(str));
	}
	public static int getLength(String str) {
		int i=0;
		try {
			for(i=0;;i++)
				str.charAt(i);
		}
		catch(Exception e){
			
		}
		return i;
	}

}
