package Projects;
import java.util.Iterator;
import java.util.*;
public class Linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
			//creating LinkedHashSet
				LinkedHashSet<String> lhs=new LinkedHashSet<String>();
				lhs.add("java");
				lhs.add("JSP");
				lhs.add("spring");
	            lhs.add("Hibernate");
				lhs.add("JSP");
				lhs.add("JAVA");
				lhs.add(null);
				lhs.add(null);
				lhs.add(null);
				//Printing the elements of HashSet
				System.out.println(lhs);
				Iterator<String> itr=lhs.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
					
				}
			}
		}
	


