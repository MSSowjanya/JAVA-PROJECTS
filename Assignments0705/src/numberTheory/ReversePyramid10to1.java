package numberTheory;

public class ReversePyramid10to1 {

	public static void main(String[] args) {
		int num=10;
		int n=4;
		int space=0;
		int value=4;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=value; k++) {
				System.out.print((num--)+ " ");
			}
			space++;
			value--;
			System.out.println();
		}

	}

}
