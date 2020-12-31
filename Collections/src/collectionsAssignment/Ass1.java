package collectionsAssignment;

import java.util.ArrayList;

public class Ass1 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Apple");
		al.add("Mango");
		al.add("Banana");
		al.add("Grapes");
		al.add("Papaya");
		System.out.println("Elemnts of al: "+al);
		
		ArrayList<String> al2=(ArrayList<String>)al.clone();
		System.out.println("Elemnts of al2: "+al2);
		
		al.add("Orange");
		System.out.println("Elemnts of al: "+al);
	}

}
