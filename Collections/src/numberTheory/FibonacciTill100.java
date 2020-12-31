package numberTheory;

public class FibonacciTill100 {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int n3=0;
		
		for(int i=0;n3<100;i++) {
			n3=n1+n2;
			System.out.println(n1);
			n1=n2;
			n2=n3;
		}


	}

}
