package collectionsAssignment;

import java.util.HashMap;

public class Ass15 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "Raja");
		hm.put(2, "Rani");
		hm.put(3, "Mantri");
		hm.put(4, "Senadhipati");
		hm.put(5, "Sene");
		System.out.println(hm.containsKey(1));
		System.out.println(hm.containsKey(6));
	}
}
