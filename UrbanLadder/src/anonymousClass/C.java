package anonymousClass;

public class C{

	public static void main(String[] args) {
		A ac=new A() {
			@Override
			public void m1() {
				System.out.println("From Ananymous class");
			}
		};
		ac.m1();

	}

}
