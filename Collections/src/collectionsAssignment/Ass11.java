package collectionsAssignment;

import java.util.Iterator;
import java.util.LinkedList;

public class Ass11 {
	public static void main(String[] args) {
		LinkedList<String> lst=new LinkedList<String>();
		lst.add("Parrot");
		lst.add("Peacock");
		lst.add("Pigeon");
		lst.add("Crow");
		lst.add("Humming Bird");
		lst.add("Sparrow");
		/**
		Iterator<String> it=lst.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		**/
		for(int i=lst.size()-1; i>=0; i--) {
			System.out.println(lst.get(i));
		}
	}
}
