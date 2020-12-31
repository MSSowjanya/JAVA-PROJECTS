package collectionsAssignment;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Ass18 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "Raja");
		hm.put(2, "Rani");
		hm.put(3, "Mantri");
		hm.put(4, "Senadhipati");
		hm.put(5, "Sene");
		Set<Entry<Integer, String>> entries=hm.entrySet();
		System.out.println("Elements of hm: "+hm);
		System.out.println("elements of entryset: "+entries );
	}
}
