package numberTheory;

import java.util.Scanner;

public class PrimeNumbersInGivenRange {
		static int rem=0;
		static boolean isPrime=true;
		static void print(int init,int last) {
			for(int i=init; i<=last; i++) {
				for(int j=2;j<=i/2;j++) {
					rem=i%j;
					if(rem==0) {
						isPrime=false;
						break;
					}
					else
						isPrime=true;
				}
				if(isPrime)
					System.out.print(i+" ");
			}
		}
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the initaial number");
			int init=s.nextInt();
			System.out.println("Enter the last number");
			int last=s.nextInt();
			print(init,last);		
		}
}
