package collectionsAssignment;

import java.util.Map;
import java.util.TreeMap;

public class Ass30 {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(1, "Raja");
		tm.put(2, "Rani");
		tm.put(3, "Mantri");
		tm.put(4, "Senadhipati");
		tm.put(5, "Sene");
		System.out.println(tm);
		Map<Integer, String> revmap=tm.descendingMap();
		System.out.println(revmap);
	}
}
