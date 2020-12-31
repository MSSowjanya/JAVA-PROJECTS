package numberTheory;

import java.util.Set;
import java.util.TreeSet;

public class ReturnTwoDimensonalArr {

	public static void main(String[] args) {
		int[][] ar2d=ret(25,40,54,87,36,54);	
	}
	static int[][] ret(int... value){
		int[][] arr2d=new int[3][3];
		int num=0;
		for(int i=0; i<3;i++) {
			//System.arraycopy(value,(i*2),arr2d[i],0,2);
			for(int j=0; i<3;j++) {
				//arr2d[i][j]=value[(i*2)+j];
				arr2d[i][j]=value[num++];
			}
		}
		return arr2d;
	}
}
