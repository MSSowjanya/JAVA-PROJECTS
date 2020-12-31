package encapsulation;

public class Employee {
	private int id;
	private String name;
	private int exp;
	public Employee(int id, String name, int exp) {
		this.id=id;
		this.name=name;
		this.exp=exp;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int newExp) {
		exp=newExp;
	}
}

