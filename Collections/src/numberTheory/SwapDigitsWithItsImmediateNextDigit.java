package numberTheory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SwapDigitsWithItsImmediateNextDigit {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		scan.close();
		ArrayList<Integer> al=new ArrayList<>();
		int rem=0;
		int count=0;
		while(num>0) {
			rem=num%10;
			num=num/10;
			count++;
			al.add(rem);
		}
		Collections.reverse(al);
		for(int i=0; i<al.size();i++) {
			int temp=al[i];
			al[i]=al[i+1]
		}

	}

}
