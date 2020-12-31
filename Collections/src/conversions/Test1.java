package conversions;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		Set set=new LinkedHashSet<>();
		while(set.size()<10) {
			int i=(int)(10*Math.random());
			set.add(i);
		}
		System.out.println(set);
	}
}
