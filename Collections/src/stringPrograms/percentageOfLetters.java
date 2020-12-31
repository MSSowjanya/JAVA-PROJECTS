package stringPrograms;

import java.util.Scanner;

public class percentageOfLetters {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scan.nextLine();
		int uc=0;
		int lc=0;
		int num=0;
		int spch=0;
	
		char[] arr=str.toCharArray();
		for(int i=0; i<arr.length;i++) {
			int asc=arr[i];			
			if(asc>=65 && asc<=90)
				uc++;
			else if(asc>=97 && asc<=122)
				lc++;
			else if(asc>=48 && asc<=57)
				num++;
			else
				spch++;		
		}
		int div=arr.length;
		double ucper=(uc*100)/div;
		double lcper=(lc*100)/div;
		double numper=(num*100)/div;
		double spchper=(spch*100)/div;
		System.out.println("Percentage of UpperCase Letters: "+ucper);
		System.out.println("Percentage of LowerCase Letters: "+lcper);
		System.out.println("Percentage of digits: "+numper);
		System.out.println("Percentage of special Characters: "+spchper);

	}

}
