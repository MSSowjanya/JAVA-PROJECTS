package oopsExamples;


class Father{
	String color="wheatish";
	String hairColor="Black";
	double height=5.8;
}
class Son extends Father{
	String eyeColor="Brownish";
	double height=6.2;
}
public class Inheritance {	
	public static void main(String[] args) {
		Son s1=new Son();
		System.out.println(s1.hairColor);
		System.out.println(s1.color);
		System.out.println(s1.height);
		System.out.println(s1.eyeColor);
		Father F=new Father();
		System.out.println(F.height);
	}
}
