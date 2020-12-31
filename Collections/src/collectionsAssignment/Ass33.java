package collectionsAssignment;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Ass33 {
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "DD");
		map.put(2, "SS");
		Map<Integer, String> sysMap=Collections.synchronizedMap(map);
		System.out.println(sysMap);
	}
}
