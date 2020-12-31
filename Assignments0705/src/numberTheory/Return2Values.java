package numberTheory;

public class Return2Values {

	public static void main(String[] args) {
		int[] arr1=ret(10,20);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);

	}
	static int[] ret(int num1, int num2) {
		int[] arr=new int[2];
		arr[0]=num1+num2;
		arr[1]= num2-num1;
		return arr;
	}

}
