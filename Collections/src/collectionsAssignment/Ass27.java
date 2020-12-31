package collectionsAssignment;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Ass27 {
	public static void main(String[] args) {
			TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
			tm.put(1, "Raja");
			tm.put(2, "Rani");
			tm.put(3, "Mantri");
			tm.put(4, "Senadhipati");
			tm.put(5, "Sene");
			Set<Entry<Integer, String>> entries=tm.entrySet();
			System.out.println("Elements of hm: "+tm);
			System.out.println("elements of entryset: "+entries );
	}
}
