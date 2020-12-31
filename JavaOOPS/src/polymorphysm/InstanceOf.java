package polymorphysm;

public class InstanceOf {

	public static void main(String[] args) {
		Sample1 ref=new Sample1();
		if(ref instanceof Sample2)
			System.out.println("YES");
		else
			System.out.println("NO");
		
		Sample1 ref1=new Sample3();
		if(ref1 instanceof Sample2)
			System.out.println("YES");
		else
			System.out.println("NO");

	}

}
