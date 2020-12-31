package object;

public class Hashcode {
	public static void main(String[] args) {
		Student student1= new Student(12,"RAMA");
		System.out.println(student1.hashCode());
		Student student2= new Student(13,"RAMYA");
		System.out.println(student2.hashCode());
		Object ref1=new Object();
		System.out.println(ref1.hashCode());
	}
}
