package collectionsAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ass4 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>(Arrays.asList("Madhu", "Siri", "Sampath","Keerthi", "Venu"));
		System.out.println("Before shuffle: "+al);
		Collections.shuffle(al);
		System.out.println("After Shuffle: "+al);
		Collections.shuffle(al);
		System.out.println("After Shuffle: "+al);
	}
}
