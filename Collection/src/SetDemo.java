import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetDemo {
public static void main(String[] args) {
	Set s1 = new HashSet();
	s1.add("Hello");
	s1.add("are");
	s1.add("you");
	s1.add(101);
	
	
	Iterator ii = s1.iterator();
	while(ii.hasNext()){
		System.out.println(ii.next());
	}
	s1.remove(101);
	System.out.println("------------");
	Iterator ii1 = s1.iterator();
	while(ii1.hasNext()){
		System.out.println(ii1.next());
	}
}
}
