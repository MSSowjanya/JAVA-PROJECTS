package oopsExamples;

public class Encapsulation {
	private  String username="Divya";
	private  String password="Shree";
	public  String getUsername() {
		return username;
	}
	String getPassword() {
		return this.password;
	}
	void setUsername(String username) {
		this.username=username;
	}
	public static void main(String[] args) {
		Encapsulation en=new Encapsulation();
		System.out.println(en.getUsername());
		System.out.println(en.getPassword());
		en.setUsername("Sathya");
		System.out.println(en.getUsername());
	}
}
