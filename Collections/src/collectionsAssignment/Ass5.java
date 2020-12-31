package collectionsAssignment;

import java.util.ArrayList;
import java.util.Collections;

public class Ass5 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>() {{
			add("Delhi");
			add("Mangalore");
			add("Trichi");
			add("Ooty");
		}};
		System.out.println("Before swap: "+al);
		Collections.swap(al, 0, 1);
		System.out.println("After swap: "+al);
	}
}
