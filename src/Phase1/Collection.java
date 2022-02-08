package Phase1;
import java.util.*;

public class Collection {

	public static void main(String[] args) {
		// CREATING ARRAYLIST
		System.out.println("ArrayList");
		ArrayList<String> city = new ArrayList<String>();
		
		city.add("Pune");
		city.add("Mumbai");
		System.out.println(city);
		
		//	 CREATING VECTOR
		System.out.println("\n");
		System.out.println("Vector");
		Vector<Integer> vec = new Vector();
		vec.addElement(15);
		vec.addElement(30);
		System.out.println(vec);

		//CREATING LINKEDLIST
		System.out.println("\n");
		System.out.println("LinkedList");
		LinkedList<String> names = new LinkedList<String>();
	      names.add("Satish");  
	      names.add("Ajay");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(101);  
	       set.add(103);  
	       set.add(102);
	       set.add(104);
	       System.out.println(set);
	       
	       //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(11);  
	       set2.add(13);  
	       set2.add(12);
	       set2.add(14);	       
	       System.out.println(set2);
	      	} 


	}

}