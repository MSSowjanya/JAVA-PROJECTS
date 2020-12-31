package collectionsAssignment;

import java.util.LinkedList;

public class Ass10 {
	public static void main(String[] args) {
		LinkedList<String> lst=new LinkedList<String>();
		lst.add("MM");
		lst.add("SS");
		lst.add("GG");
		System.out.println(lst.getLast());
		System.out.println(lst.peekLast());
	}
}
