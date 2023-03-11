package Collection;
import java.util.TreeSet;
import java.util.Iterator;

public class treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set1=new TreeSet<String>();

		set1.add("raju");
		set1.add("google");
		set1.add("msoffice");
		Iterator<String> itr =set1.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		
		

	}
	}
}
