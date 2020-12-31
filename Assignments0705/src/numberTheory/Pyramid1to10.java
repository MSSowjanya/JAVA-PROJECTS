package numberTheory;

public class Pyramid1to10 {

	public static void main(String[] args) {
		int num=1;
		int n=4;
		int space=n-1;
		int value=n-space;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=value; k++) {
				System.out.print((num++)+" ");
			}
			System.out.println();
			space--;
			value++;
		}

	}

}
