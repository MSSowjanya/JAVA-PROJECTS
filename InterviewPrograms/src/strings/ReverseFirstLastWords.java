package strings;

import java.util.Scanner;

public class ReverseFirstLastWords {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String");
		String str=scan.nextLine();
		System.out.println(str);
		String[] arr=str.split(" ");
		String newstr="";
		for(int i=0;i<=arr.length-1;i++) {
			if(i==0||i==arr.length-1) {
				String str1=arr[i];
				StringBuffer buff=new StringBuffer(str1);
				buff.reverse();
				String rev=buff.toString();
				arr[i]=rev;
			}
			System.out.println(arr[i]);
			newstr=newstr+" "+arr[i];
		}
		str=newstr;
		System.out.println(newstr);
		System.out.println(str);
	}

}
