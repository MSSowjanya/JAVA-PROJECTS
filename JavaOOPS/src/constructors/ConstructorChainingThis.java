package constructors;

public class ConstructorChainingThis {
	public static void main(String[] args) {
		new C1(25);
	}

}
class C1{
	C1(){
		System.out.println("constructor1");
	}
	C1(int i){
		this (21,24);
		System.out.println("constructor2");
	}
	C1(int i, int j){
		this ();
		System.out.println("constructor3");
	}
}

