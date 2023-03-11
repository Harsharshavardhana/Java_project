package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class collection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String[] names = {"John","Smith","Leena","Priya"};

		// System.out.println("The second name in array is " + names[1]);

		ArrayList<String> al = new ArrayList<String>();
		al.add("Geeks For Geeks");
		al.add("Friends");
		al.add("Dear");
		al.add("Is");
		al.add("Superb");

		/*
		 * System.out.println("The list is " + list1);
		 * System.out.println("The size of the list is " + list1.size());
		 * System.out.println("First name in the list " + list1.get(0));
		 * System.out.println("Last name in the list " + list1.get(list1.size()-1));
		 */

		/*
		 * list1.set(1, "Mike"); System.out.println("The list after updating Smith " +
		 * list1);
		 * 
		 * list1.remove(2); System.out.println("The list after deleting Leena " +
		 * list1); for(int i=0;i<list1.size();i++) { System.out.println(list1.get(i)); }
		 * for(String Value:list1) { System.out.println(Value); }
		 */
		Collections.sort(al);
		System.out.println("After sorting the list " + al);

		//Collections.sort(al, Collections.reverseOrder());
		//System.out.println("After sorting in descending order " + al);

		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
