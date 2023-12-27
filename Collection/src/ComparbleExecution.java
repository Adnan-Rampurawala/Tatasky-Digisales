import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ComparbleExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <ComparbleDemo> l1 = new ArrayList<>();
		l1.add(new ComparbleDemo(110,"Vaibhav", "Jogeshwari"));
		l1.add(new ComparbleDemo(102,"Swaraj", "Kalyan"));
		l1.add(new ComparbleDemo(125, "Mrunal", "Kadivali"));
		
		
		System.out.println("By Using Collection sort method.......");
		Collections.sort(l1);
		System.out.println(l1);
		
		
		System.out.println("By using the Comparable interface");
		
		for(ComparbleDemo cd:l1){
			System.out.println(cd); 
		}
	}

}
