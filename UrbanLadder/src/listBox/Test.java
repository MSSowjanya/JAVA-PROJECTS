package listBox;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Divya");
		al.add(2);
		al.add(3);
		al.add("Shree");
		al.add("shree");
		al.add("Veena");
		al.add("Veena");
		System.out.println(al);
		
		ArrayList<String> al1=new ArrayList(al);
		System.out.println(al1);
		
	}

}
