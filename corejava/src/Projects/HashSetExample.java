package Projects;

import java.util.HashSet;
import java.util.Iterator;
public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//creating HashSet object
		HashSet<String> set=new HashSet<String>();
		//adding elements to HashSet
		set.add("java");
		set.add("JSP");
		set.add("spring");
		set.add("Hibernate");
		set.add("JSP");
		set.add("JAVA");
		set.add(null);
		set.add(null);
		set.add(null);
		//Printing the elements of HashSet
		System.out.println(set);
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
	}

}
