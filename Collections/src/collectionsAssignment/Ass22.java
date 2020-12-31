package collectionsAssignment;

import java.util.SortedSet;
import java.util.TreeSet;

public class Ass22 {
	public static void main(String[] args) {
		SortedSet<String> ts=new TreeSet<String>();
		ts.add("RED");
        ts.add("ORANGE");
        ts.add("BLUE");
        ts.add("GREEN");
        ts.add("WHITE");
        ts.add("BROWN");
        ts.add("YELLOW");
        ts.add("BLACK");
        System.out.println(ts);
        System.out.println("Elements between B and G: "+ ts.subSet("B", "R"));      
	}
}
