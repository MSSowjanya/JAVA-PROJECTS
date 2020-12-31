package numberTheory;

public class FibonacciFrom100To10000 {

	public static void main(String[] args) {
		int n1=100;
		int n2=n1+1;
		int n3=0;
		
		for(int i=0;n3<10000;i++) {
			n3=n1+n2;
			System.out.println(n1);
			n1=n2;
			n2=n3;
		}

	}

}
