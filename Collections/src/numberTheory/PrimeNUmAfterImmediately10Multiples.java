package numberTheory;

public class PrimeNUmAfterImmediately10Multiples {

	public static void main(String[] args) {
		int rem=0;
		boolean isPrime=true;
		int i=10;
		while(i<200){
			for(int j=2;j<=i/2;j++) {
				rem=i%j;
				if(rem==0) {
					isPrime=false;
					i++;
					break;
				}
				else {
					isPrime=true;
				}
					
			}
			if(isPrime) {
				System.out.print(i+" ");
				i+=(10-(i%10));
				
			}
		}
	}

}
