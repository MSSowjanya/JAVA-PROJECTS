package abstraction;

public abstract class AbstractionMultilevel {
	abstract void test();
	abstract void disp();
}
class Sample2 extends AbstractionMultilevel{
	void test() {
		System.out.println("test in Sample2");
	}
	void disp() {
		System.out.println("disp in Sample2");
	}
}
class Sample3 extends Sample2{
	void disp() {
		System.out.println("disp in Sample3");
	}
}
