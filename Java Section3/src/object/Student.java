package object;

public class Student {
	int id;
	String name;
	public Student(int id, String name){
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return("id:"+id+" name:"+name);
	}
	public int hashCode() {
		return id;
	}
}
