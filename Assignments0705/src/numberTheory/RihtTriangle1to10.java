package numberTheory;

public class RihtTriangle1to10 {

	public static void main(String[] args) {
		int n=4;
		int num=1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print((num++)+" ");
			}
			System.out.println();
		}

	}

}
