package constructors;

public class HasARelationship {

	public static void main(String[] args) {
		Sample2 ref1=new Sample2();
		System.out.println(ref1);
		System.out.println(ref1.ref);
		System.out.println(ref1.i);
		Sample1 ref2= new Sample1();
		ref2.m1();
		ref1.ref.m1();

	}

}
class Sample1{
	void m1() {
		System.out.println("method m1");
	}
}
class Sample2{
	int i=30;
	Sample1 ref=new Sample1();
}