package collectionsAssignment;

import java.util.TreeMap;

public class Ass23 {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(1, "Raja");
		tm.put(2, "Rani");
		tm.put(3, "Mantri");
		tm.put(4, "Senadhipati");
		tm.put(5, "Sene");
		TreeMap<Integer, String> tm2=new TreeMap<Integer, String>();
		System.out.println(tm);
		tm2.putAll(tm);
		System.out.println(tm2);
	}
}
