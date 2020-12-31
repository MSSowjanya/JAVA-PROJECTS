package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortAL {
	public static void main(String[] args) {
		ArrayList<String> al1=new ArrayList<String>();
		al1.add("Abhi");
		al1.add("Madhu");
		al1.add("Divya");
		al1.add("Shree");
		al1.add("Veena");
		
		System.out.println("Before sort");
		System.out.println(al1);
		
		Collections.sort(al1);
		
		System.out.println("After sort");
		System.out.println(al1);
		System.out.println("--------------------");
		Collections.reverse(al1);
		System.out.println(al1);
		
		for(int i=0; i<al1.size();i++) {
			System.out.println(al1.get(i));
		}
		
		for(int i=al1.size()-1;i>=0;i--) {
			System.out.println(al1.get(i));
		}
		
		System.out.println("Reverse order");
		Collections.sort(al1, Collections.reverseOrder());
		System.out.println(al1);
	}
}
