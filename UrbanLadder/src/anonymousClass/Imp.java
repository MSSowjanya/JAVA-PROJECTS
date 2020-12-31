package anonymousClass;

interface Inter1 {
	abstract public void intm();

}

public class Imp{
	public static void main(String[] args) {
		Inter1 obj=new Inter1() {
			public void intm() {
				System.out.println("Implemeneted in anonymous class");
			}
		};
	}
}