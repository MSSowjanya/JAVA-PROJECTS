package numberTheory;

public class PrimeNumbersHavingDigitsInRaisingOrder {
	public static void main(String[] args) {
		int rem=0;
		boolean isPrime=true;
		int count=0;
		for(int i=10; count<30; i++) {
			for(int j=2;j<=i/2;j++) {
				rem=i%j;
				if(rem==0) {
					isPrime=false;
					break;
				}
				else {
					isPrime=true;
				}
					
			}
			
			if(isPrime && (i/10<i%10)) {
				System.out.print(i+" ");
				count++;
			}
				
		}
	}
}
