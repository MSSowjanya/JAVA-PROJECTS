package numberTheory;

public class PrintPrimeNumbers1to100 {

	public static void main(String[] args) {
		boolean isPrime=true;
		for(int num=2;num<=1000;num++) {
			for(int j=2; j<=num/2; j++) {
				if(num%j==0) {
					isPrime=false;
					break;
				}
				else {
					isPrime=true;
				}
			}
			if(isPrime) {
				System.out.println(num);
			}
		}
	}

}
