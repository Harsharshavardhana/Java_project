package Collection;
import java.util.*;
public class map {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap<String, Integer> obj = new HashMap<String, Integer>();
	obj.put("item1", 1);
	obj.put("item2", 2);
	obj.put("item3", 3);
	obj.put("item4", 4);
	obj.put("item5", null);
	obj.put(null, null);
	System.out.println("before remove"+obj);
	obj.remove("item3");
	System.out.println("after remove remove"+obj);
	System.out.println("using key set");
	for(String item:obj.keySet()) {
		System.out.println("map value"+"  "+item);
		System.out.println("map value"+"  "+obj.get(item));
	}
	System.out.println("using values");
	for(Integer item:obj.values()) {
		System.out.println("map value"+"  "+item);
		System.out.println("map value"+"  "+obj.get(item));
	}
	System.out.println("count number world");
	String str = "google is not equal of google thanks thanks";
    String[] words = str.split(" ");
    HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
    for (String word : words) {
        if (wordCount.containsKey(word)) {
            int count = wordCount.get(word);
            wordCount.put(word, count + 1);
        } else {
            wordCount.put(word, 1);
        }
    }
    System.out.println(wordCount);
	}

}
