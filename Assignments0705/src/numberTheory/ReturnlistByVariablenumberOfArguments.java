package numberTheory;

import java.util.ArrayList;
import java.util.List;

public class ReturnlistByVariablenumberOfArguments {

	public static void main(String[] args) {
		System.out.println(ret("Divya","Veena","Shree"));

	}
	static List<String> ret(String... value){
		List<String> lst=new ArrayList();
		for(String i:value) {
			lst.add(i);
		}
		return lst;
	}

}
