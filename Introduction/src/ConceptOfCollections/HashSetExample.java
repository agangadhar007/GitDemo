package ConceptOfCollections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> hs = new HashSet<String>();
hs.add("India");
hs.add("USA");
hs.add("UK");
//HastSet does not allow duplicates
hs.add("India");
System.out.println(hs);
hs.remove("UK");
hs.add("Japan");
hs.add("UAE");
System.out.println(hs.isEmpty());
System.out.println(hs.size());

Iterator<String> I = hs.iterator();

while(I.hasNext())
{
System.out.println(I.next());	
}


	}

}
