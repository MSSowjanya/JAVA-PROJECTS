package polymorphysm;

public class Downcasting {
	public static void main(String[] args) {
		
		Sample1 ref1=new Sample3();
		System.out.println(ref1.i);
		ref1.disp();
		
		Sample2 ref2=(Sample2)ref1;
		System.out.println(ref2.i);
		ref2.disp();
		System.out.println(ref2.d);
		ref2.test();
		
		Sample3 ref3=(Sample3)ref1;
		System.out.println(ref3.i);
		ref3.disp();
		System.out.println(ref3.d);
		ref3.test();
		System.out.println(ref3.c);
		ref3.demo();
	}

}
