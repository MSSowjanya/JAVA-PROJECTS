package collectionsAssignment;

import java.util.LinkedList;

public class Ass6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> lst=new LinkedList<String>();
		lst.add("More");
		lst.add("BigBazaar");
		lst.add("Mega Mart");
		lst.add("Metro Mall");
		String arr[]=new String[lst.size()];
		lst.toArray(arr);
		System.out.println("LinkedList Elements: "+lst);
		for(String str:arr) {
			System.out.println(str);
		}
	}
}
