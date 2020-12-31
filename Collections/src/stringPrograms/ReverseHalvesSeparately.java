
package stringPrograms;

import java.util.Scanner;

public class ReverseHalvesSeparately {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String data=scan.nextLine();
		System.out.println(reverse(data));
	}
	public static String reverse(String data) {
		int length=data.length();
		if(length%2 != 0)
			return data;
		int midPoint=length/2;
		String FirstHalf=data.substring(0, midPoint);
		StringBuffer str=new StringBuffer(FirstHalf);
		String rFirstHalf=str.reverse().toString();
		String SeconHalf=data.substring(midPoint);
		StringBuffer str1=new StringBuffer(SeconHalf);
		String rSeconHalf=str1.reverse().toString();
		return rFirstHalf+rSeconHalf;
		
		
	}

}
