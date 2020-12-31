package interfaceFiles;

public abstract class Sample2 implements MultiLevel {
	public void test() {
		System.out.println("test in Sample2");
	}
}
class Sample3 extends Sample2{
	public void test() {
		System.out.println("test in Sample3");
	}
	public void disp() {
		System.out.println("disp in Sample3");
	}
}
