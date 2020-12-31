package basicsOfClassObject;

public class StaticNonStatic {
	public static void main(String[] args) {
		System.out.println("stayic int values are: "+Members.a+", "+Members.b);
		System.out.println("static char value is "+ Members.c);
		Members.m1();
		Members ref=new Members();
		System.out.println("Instance int values are "+ref.x+", "+ref.y);
		System.out.println("Instance char value is "+ ref.d);
		ref.m2();
	}

}
class Members{
	static int a,b;
	static char c;
	static void m1() {
		System.out.println("Static method m1");
	}
	int x,y;
	char d;
	void m2() {
		System.out.println("Instance method m2");
	}
}
