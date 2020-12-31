package collectionsAssignment;

import java.util.ArrayList;
import java.util.List;

public class Ass2 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(5);
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		System.out.println(al.containsAll(lst));
	}
}
