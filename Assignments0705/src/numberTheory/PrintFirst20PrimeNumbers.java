package numberTheory;

public class PrintFirst20PrimeNumbers {

	public static void main(String[] args) {
		int rem=0;
		int count=0;
		boolean isPrime=true;
		for(int num=2;count<20;num++) {
			for(int j=2; j<=num/2; j++) {
				rem=num%j;
				if(rem==0) {
					isPrime=false;
					break;
				}
				else {
					isPrime=true;
				}
			}
			if(isPrime) {
				System.out.println(num);
				count++;
			}
		}
	}



}
