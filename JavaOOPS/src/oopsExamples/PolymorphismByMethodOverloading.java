package oopsExamples;



public class PolymorphismByMethodOverloading {
	static int sum=0;
	static void registerGmail(String name, String password, int age) {
		System.out.println("Login using all fields");
	}
	static void registerGmail(String name, String password) {
		System.out.println("Login using mandatory fields");
	}
	public static void main(String[] args) {
		registerGmail("Divya","Shree",25);
		registerGmail("Divya","Shree");
	}
}
