package collectionsAssignment;

import java.util.HashMap;
import java.util.Map;

public class Ass14 {
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "Divya");
		map.put(2, "Sahana");
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(11, "sathya");
		hm.put(12, "Vasishta");
		System.out.println("Before");
		System.out.println("map: "+map);
		System.out.println("hm: "+hm);
		map.putAll(hm);
		System.out.println("After");
		System.out.println("map: "+map);
		System.out.println("hm: "+hm);
	}
}
