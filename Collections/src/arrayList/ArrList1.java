package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1=new Student(01, "raj", 20);
		Student st2=new Student(02, "raja", 20);
		Student st3=new Student(03, "Ram", 20);
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(st1);
		al.add(st2);
		al.add(st3);
		Iterator it = al.iterator();
		
		System.out.println(al);
		
		while(it.hasNext()) {
			Student st=(Student) it.next();
			System.out.println(st.name+" "+st.rollnum+" "+st.age);
		}
		al.remove(1);
		
		for(Object obj:al) {
			System.out.println(obj);
		}
		for(int i=0; i<al.size(); i++) {
			Student sobj=(Student)al.get(i);
			System.out.println(sobj.name+" "+sobj.rollnum+" "+sobj.age);
		}
	}
	
	

}
