package polymorphysm;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 ref1=(Sample1)new Sample2();//explicit upcasting
		System.out.println("i value is "+ref1.i);
		ref1.disp();
		Sample1 ref2=new Sample2();//implicit upcasting
		System.out.println("i value is "+ref2.i);
		ref2.disp();
		//Sample2 ref3=new Sample1();==>Downcating not possible in this way
		
		
		x objref=new x();
		objref.run(new Sample1());
		objref.run(new Sample3());
		
	}

}
class Sample1{
	int i=10;
	void disp() {
		System.out.println("Display in Sample1");
	}
}
class Sample2 extends Sample1{
	double d=3.4;
	void test() {
		System.out.println("test in Sample2");

	}
}
class Sample3 extends Sample2{
	char c='a';
	void demo() {
		System.out.println("demo in sample3");
	}
}
class x{
	void run(Sample1 arg) {
		System.out.println("i value is "+ arg.i);
		arg.disp();
	}
}