package numberTheory;

import java.util.Scanner;

public class IsMultipleOf4Or5OrBoth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		for(int i=1; i<=100; i++) {
			if((i%4==0) &&(i%5==0))
				System.out.println("lara");
			else if (i%4==0){
				System.out.println("java");
			}
			else if(i%5==0)
				System.out.println("j2ee");
		}
	}

}
