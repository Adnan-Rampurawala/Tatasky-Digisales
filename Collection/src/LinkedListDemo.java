import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;




public class LinkedListDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1 = new LinkedList();
		l1.add("Hello");
		l1.add("are");
		l1.add("you");
		l1.set(1, null);
		
		
		ListIterator li1 = l1.listIterator(l1.size());
		Set s1 = new HashSet(l1);
		while(li1.hasPrevious()){
			System.out.println(li1.previous());
			System.out.println(li1.previousIndex());
		}
		System.out.println("-------------");
		Iterator ii = s1.iterator();
		while(ii.hasNext()){
			System.out.println(ii.next());
		}

	}

}
