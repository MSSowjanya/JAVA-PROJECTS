package numberTheory;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of 2D array");
		int row=scan.nextInt();
		int col=scan.nextInt();
		
		int[][] B=ConvertTo2d(row,col,25,45,12,41,32,54,55);
		for(int i=0; i<row;i++) {
			for(int j=0; j<col;j++) {
				System.out.print(B[i][j]+" ");
			}
			System.out.println();
		}
	}
	static int[][] ConvertTo2d(int m, int n, int ... params){
		int[][] A=new int[m][n];
		int row, col;
		
		for(int i=0; i<m;i++) {
			for(int j=0; j<n;j++) {
				A[i][j]=0;
			}
		}	
		int len=params.length;
		if(len>m*n) {
			len=m*n;
		}
		
		for(int i=0; i<len;i++) {
			row=i/n;
			col=i-row*n;
			A[row][col]=params[i];
		}
		return A;
	}

}
