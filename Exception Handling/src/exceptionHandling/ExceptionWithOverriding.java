package exceptionHandling;

public class ExceptionWithOverriding {
	public static void main(String[] args) throws Exception {
		new Ex2().m1();
		new Ex().m1();
	}
}

class Ex{
	void m1() throws NumberFormatException{
		System.out.println("From m1");
	}
}
class Ex2 extends Ex{
	void m1(){
		System.out.println("From m2");
	}
}
