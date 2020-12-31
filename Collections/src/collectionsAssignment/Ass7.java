package collectionsAssignment;

import java.util.LinkedList;
import java.util.List;

public class Ass7 {
	public static void main(String[] args) {
		LinkedList<String> lst=new LinkedList<String>();
		lst.add("Flipkart");
		lst.add("Myntra");
		lst.add("Amazon");
		lst.add("Snapdeal");
		List<String> list=lst.subList(1, 4); //last index value should be +1
		System.out.println(lst);
		System.out.println(list);
	}
}
