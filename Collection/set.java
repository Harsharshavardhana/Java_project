package Collection;
import java.util.HashSet;
import java.util.Iterator;
public class set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set1=new HashSet<String>();

		set1.add("raju");
		set1.add("google");
		set1.add("msoffice");
		set1.add("google");
		set1.add(null);
		Iterator<String> itr =set1.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		
	}

	
}
}
