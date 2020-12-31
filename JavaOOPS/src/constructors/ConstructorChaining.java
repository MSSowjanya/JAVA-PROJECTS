package constructors;

public class ConstructorChaining {
	public static void main(String[] args) {
		new Class3();
	}

}
class Class1{
	Class1(){
		System.out.println("Constructor in Class1");
	}
}
class Class2 extends Class1{
	Class2(){
		System.out.println("Constructor in Class2");
	}
}
class Class3 extends Class2{
	Class3(){
		System.out.println("Constructor in Class3");
	}
}