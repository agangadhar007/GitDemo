package ConceptOfCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer, String> hm = new HashMap<Integer, String>();
hm.put(0, "Hello");
hm.put(1, "How are you");
hm.put(2, "Good Morning");
hm.put(42, "Good Night");
hm.put(3, "Bye");
System.out.println(hm.get(42));
hm.remove(42);
System.out.println(hm.get(42));
Set s = hm.entrySet();
Iterator i=s.iterator();

while(i.hasNext())
{
Map.Entry me =(Map.Entry)i.next();	
System.out.println(me.getKey());
System.out.println(me.getValue());
}
}

}
