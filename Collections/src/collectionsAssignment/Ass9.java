package collectionsAssignment;

import java.util.LinkedList;

public class Ass9 {
	public static void main(String[] args) {
		LinkedList<String> lst=new LinkedList<String>();
		lst.add("MM");
		lst.add("SS");
		lst.add("GG");
		System.out.println(lst.getFirst());
		System.out.println(lst.element());
		System.out.println(lst.peek());
		System.out.println(lst.peekFirst());
	}
}
