package constructors;

public class Initialization {

	public static void main(String[] args) {
		Pen P1=new Pen("RED");
		P1.disp();
		Pen P2=new Pen("BLUE");
		P2.disp();
		Pen P3=new Pen("BLACK");
		P3.disp();
	}

}
class Pen{
	String color;
	Pen(String color){
		this.color=color;
	}
	void disp() {
		System.out.println("color of the pen is: "+color);
	}
}
