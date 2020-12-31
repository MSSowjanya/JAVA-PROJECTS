package basicExamples;

public class AdamsNumber {
	static int num=12;
	static int sqNum=0;
	static int revNum=0;
	static int revSqNum=0;
	public static void main(String[] args) {
		for(int num=0; num<1000; num++) {
			sqNum=num*num;
			revNum=reverse(num);
			revSqNum=revNum*revNum;
			if(sqNum==reverse(revSqNum)) {
				System.out.print(num+" ");
			}
		}
	}
	static int rev;
	static int reverse(int num) {
		rev=0;
		while(num>0) {
			rev=rev*10+(num%10);
			num=num/10;
		}
		return rev;
	}
}
