package constructors;

public class ConstructorBasics {
	public static void main(String[] args) {
		Members ref=new Members();
		System.out.println("i value is: "+ref.i);
		System.out.println("name: "+ref.name);
		ref.i=1000;
		System.out.println("Updated i value is: "+ref.i);
		
	}

}
class Members{
	int i=200;
	String name="Divya";
	Members(){
		i=500;
		name="Shree";
	}
}
