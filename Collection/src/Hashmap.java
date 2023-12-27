import java.util.HashMap;
import java.util.Map;


public class Hashmap {

	public static void main(String[] args) {
		
		Map<Integer, String> m2 = new HashMap<Integer,String>();
		m2.put(121,"Nikita");
		// TODO Auto-generated method stub
		Map<Integer, String> m1 = new HashMap<Integer,String>();
		m1.put(1,"Vaibhav");
		m1.put(2,"Vaibhav");
		System.out.println("---------------"); 
		System.out.println(m1.get(2));
		System.out.println("----------------");
		m1.putAll(m2);
		System.out.println(m1); 
		
		
		System.out.println(m1.keySet());
		System.out.println(m1.values()); 
		
	}

}
