package collectionsAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Ass31 {
	public static void main(String[] args) {
		List<String> lst=Collections.synchronizedList(new ArrayList<String>());//Upcasting is must
		lst.add("practice"); 
        lst.add("code"); 
        lst.add("quiz"); 
  
        synchronized(lst) 
        { 
            // must be in synchronized block 
            Iterator<String> it = lst.iterator(); 
  
            while (it.hasNext()) 
                System.out.println(it.next()); 
        }
        /**
         *  // creating a thread-safe Arraylist. 
        CopyOnWriteArrayList<String> threadSafeList 
            = new CopyOnWriteArrayList<String>(); 
  
        // Adding elements to synchronized ArrayList 
        threadSafeList.add("geek"); 
        threadSafeList.add("code"); 
        threadSafeList.add("practice"); 
  
        System.out.println("Elements of synchronized ArrayList :"); 
  
        // Iterating on the synchronized ArrayList using iterator. 
        Iterator<String> it = threadSafeList.iterator(); 
  
        while (it.hasNext()) 
            System.out.println(it.next()); 
    } 
         */	 
	}
}
