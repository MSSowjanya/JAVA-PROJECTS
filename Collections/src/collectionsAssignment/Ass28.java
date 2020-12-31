package collectionsAssignment;

import java.util.Map;
import java.util.TreeMap;

public class Ass28 {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(1, "Raja");
		tm.put(2, "Rani");
		tm.put(3, "Mantri");
		tm.put(4, "Senadhipati");
		tm.put(5, "Sene");
		Map<Integer, String> submap1=tm.subMap(1, 3);
		System.out.println(submap1);
		Map<Integer, String> submap2=tm.subMap(1, false, 5, true);
		System.out.println(submap2);
		Map<Integer, String> submap3=tm.subMap(1, true, 5, false);
		System.out.println(submap3);
	}
}
