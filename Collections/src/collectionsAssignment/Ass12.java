package collectionsAssignment;

import java.util.HashSet;
import java.util.Set;

public class Ass12 {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("100");
		hs.add("200");
		hs.add("300");	
		Set<String> set=new HashSet<String>();
		set.add("500");
		set.add("1000");
		System.out.println(hs);
		hs.addAll(set);
		System.out.println(hs);
	}
}
