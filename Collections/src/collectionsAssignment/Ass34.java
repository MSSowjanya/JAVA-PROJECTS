package collectionsAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ass34 {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
        li.add(23);
        li.add(44);
        li.add(12);
        li.add(45);
        li.add(2);
        li.add(16);
        System.out.println("Maximum element from the list: "+Collections.max(li));
	}
}
