package abstraction;

public abstract class AbstractSingleInheritance {
	void disp() {
		System.out.println("disp in 1");
	}
	abstract void test();
}
class Sample1 extends AbstractSingleInheritance{
	void test() {
		System.out.println("test in Sample1");
	}
}
	


