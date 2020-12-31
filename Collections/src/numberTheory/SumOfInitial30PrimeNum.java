package numberTheory;

public class SumOfInitial30PrimeNum {

	public static void main(String[] args) {
		int rem=0;
		boolean isPrime=true;
		int count=0;
		int sum=0;
		for(int i=1; count<20; i++) {
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
			
			if(isPrime) {
				System.out.print(i+" ");
				count++;
				sum=sum+i;
				
			}
				
		}
		System.out.println();
		System.out.println("sum: "+sum);

	}

}
