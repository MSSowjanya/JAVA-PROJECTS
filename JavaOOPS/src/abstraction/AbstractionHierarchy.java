package abstraction;

public abstract class AbstractionHierarchy {
	abstract void test();
	abstract void disp();
}
class Sample4 extends AbstractionHierarchy{
	void test(){
		System.out.println("test in Sample4");
	}
	void disp() {
		System.out.println("disp in Sample4");
	}
}
class Sample5 extends AbstractionHierarchy{
	void test(){
		System.out.println("test in Sample5");
	}
	void disp() {
		System.out.println("disp in Sample5");
	}
}



