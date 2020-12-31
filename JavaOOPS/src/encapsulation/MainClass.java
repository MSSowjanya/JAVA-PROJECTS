package encapsulation;

public class MainClass {

	public static void main(String[] args) {
		Employee ref = new Employee(12, "rama", 4);
		System.out.println(ref.getId());
		System.out.println(ref.getName());
		System.out.println(ref.getExp());
		ref.setExp(5);
		System.out.println(ref.getId());
		System.out.println(ref.getName());
		System.out.println(ref.getExp());
	}

}
