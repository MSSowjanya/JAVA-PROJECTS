package numberTheory;

public class PrimeNumFromFibonacci {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int n3=0;
		
		for(int i=0;n3<5000;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			int rem=0;
			boolean isPrime=true;
			for(int j=2;j<=i/2;j++) {
				rem=n1%j;
				if(rem==0) {
					isPrime=false;
					break;
				}
				else {
					isPrime=true;
				}
					
			}
			if(isPrime ) {
				System.out.print(n1+" ");
			}
		}

	}

}
