package collectionsAssignment;

import java.util.TreeMap;

public class Ass24 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(1, "Raja");
		tm.put(2, "Rani");
		tm.put(3, "Mantri");
		tm.put(4, "Senadhipati");
		tm.put(5, "Sene");
		System.out.println(tm.containsKey(3));
		System.out.println(tm.containsKey(7));
	}
}
