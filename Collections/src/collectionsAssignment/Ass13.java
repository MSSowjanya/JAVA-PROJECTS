package collectionsAssignment;

import java.util.HashSet;
import java.util.Set;

public class Ass13 {
	public static void main(String[] args) {
		Set<String> set1= new HashSet<String>() ;
		set1.add("Rama");
		set1.add("Seetha");
		set1.add("lakshman");
		Set<String> set2=new HashSet<String>();
		set2.add("Ravana");
		set2.add("Rama");
		set2.add("Seetha");
		set2.add("Hanumantha");
		System.out.println("set1 elements before comparison: "+set1);
		set1.retainAll(set2);
		System.out.println("set1 elements after comparison: "+set1);
	}

}
