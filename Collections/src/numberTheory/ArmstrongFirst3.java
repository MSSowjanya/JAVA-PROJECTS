package numberTheory;

public class ArmstrongFirst3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count1=0;
		int count=0;
		int sum=0;
		int temp;
		
		for(int i=10;count1<=3;i++) {
			temp=i;
			while(temp>0) {
				count++;
				temp=temp/10;
			}	
			temp=i;
			while (temp>0){
				int rem=temp%10;	
				int m=1;
				for(int j=1; i<=count; i++) {
					m=m*rem;
				}
				sum=sum+m;
				temp=temp/10;
			}
			if(sum==i) {
				count1++;
				System.out.println(i);
			}			
		}
	}
}
