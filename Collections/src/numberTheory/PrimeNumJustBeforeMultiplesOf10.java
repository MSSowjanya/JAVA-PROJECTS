package numberTheory;

public class PrimeNumJustBeforeMultiplesOf10 {

	public static void main(String[] args) {
		int rem=0;
		boolean isPrime=true;
		int i=200;
		while(i>1){
			for(int j=2;j<=i/2;j++) {
				rem=i%j;
				if(rem==0) {
					isPrime=false;
					i--;
					break;
				}
				else {
					isPrime=true;
				}
					
			}
			if(isPrime) {
				System.out.print(i+" ");
				i-=(i%10);
				
			}
		}

	}

}
