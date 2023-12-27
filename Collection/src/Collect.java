import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collect{
	public static void main(String[] args) {
		List l1 = new ArrayList<>();
		l1.add("vaibhav");
		l1.add("Vishal");
		l1.add("Deepak");
		l1.add(222);
		
		
		List l11 = new ArrayList();
		l11.add("Pawaskar");
		l11.add("Avhad");
		l11.add("Kamble");
		l11.add(224);
		
		Iterator i1 = (l1.iterator());
		while(i1.hasNext()){
			System.out.println(i1.next());
			
	
			
		}
		l11.add(4, "element");	
		System.out.println(l11);
		l11.addAll(l1);
		System.out.println(l11);
		System.out.println(l11.isEmpty());
		System.out.println(l11.get(2));
		l11.set(3, 6969);
		System.out.println(l11);
		
		l1.set(3, "om");
		System.out.println(l1);
		
		Collections.sort(l1);

		Iterator iq1 = (l1.iterator());
		System.out.println("SORT");
		while(iq1.hasNext()){
			
			System.out.println(iq1.next());
			
			ListIterator li1 = l1.listIterator(l1.size());
			System.out.println("Reverse Treverse");
			while(li1.hasPrevious()){
				
				System.out.println(li1.previous());
			}
	}
	

}
}
