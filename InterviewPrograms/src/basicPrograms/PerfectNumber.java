package basicPrograms;

public class PerfectNumber {
	public static boolean isPerfect(int num) {
		int temp=0;
		for(int i=1; i<=num/2;i++) {
			int res=num%i;
			if(res==0)
				temp=temp+i;			
		}
		if(temp==num)
			return true;
		else
			return false;
	}
}
