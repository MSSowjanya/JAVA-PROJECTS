package numberTheory;

public class PerfectInitial10Num {

	public static void main(String[] args) {
		int sum=0;
		int i;
		int j;
		int count=0;
		for(i=10;count<=5;i++) {
			for(j=1;j<i;j++)
			if(i%j==0)
				sum=sum+j;
				
		}
		if(sum==i) {
			System.out.println(i);
			count++;
		}
			
		

	}

}
