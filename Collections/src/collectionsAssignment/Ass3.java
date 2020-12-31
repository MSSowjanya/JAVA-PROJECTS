package collectionsAssignment;

import java.util.ArrayList;

public class Ass3 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Blue");
		al.add("Green");
		al.add("White");
		al.add("Red");
		String[] strarr=new String[al.size()];
		al.toArray(strarr);
		System.out.println(al);
		for(int i=1; i<=strarr.length;i++) {
			System.out.println(i);
		}
	}
}
