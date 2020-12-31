package collectionsAssignment;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Ass32 {
	public static void main(String[] args) {
		Set<String> ss = new HashSet<String>();
		ss.add("Divya");
		ss.add("Shree");
        Set<String> sysSet = Collections.synchronizedSet(ss);
        System.out.println("Synchronized set got created...");
        System.out.println(ss);
        System.out.println(sysSet);   
	}
}
