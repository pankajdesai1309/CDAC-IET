
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MyHashMap {

	public static void main(String[] args) {

		HashMap<Integer,String> students=new HashMap<>();
		students.put(1, "Harshal");
		students.put(2, "Pratik");
		students.put(3, "Nilesh");
		students.put(4, "Vishu");
		students.put(5, "Sanket");
		
		Set<Integer> key=students.keySet();
		System.out.println("All Roll No. In HashMap : ");
		
		Iterator<Integer> itt=key.iterator();
		while(itt.hasNext()) 
		{
			System.out.println(itt.next());
		}
		
		Collection<String> names =students.values();
		System.out.println("All Names In HashMap : ");
		for(String nm : names) 
		{
			System.out.println(nm);
		}
	}//end of main

}//end of class