package numberTheory;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ReturnSortedCollection {

	public static void main(String[] args) {
		System.out.println(ret("Divya","Veena","Shree"));
	}
	static Set<String> ret(String... value){
		//List<String> lst=new ArrayList();
		Set<String> set=new TreeSet<>();
		for(String i:value) {
			set.add(i);
		}
		
		return set;
	}

}
