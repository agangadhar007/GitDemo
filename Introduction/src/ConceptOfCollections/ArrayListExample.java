package ConceptOfCollections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> a = new ArrayList<String>();
a.add("Mphasis");     //Adds item to the arrayList
a.add("Wyde");        
System.out.println(a);
a.add(0, "Java");    // Adds an item at a specific index
System.out.println(a);
a.remove(2);        //Removes specific item by its index
a.remove("Wyde");   //Removes specific item by item name 
//a.removeAll(a);   Removes all the items from ArrayList
//System.out.println(a);
System.out.println(a.get(0));  //get the item at the specified index
System.out.println(a.contains("Java"));//can verify whether the specific item is present in arraylist or not
System.out.println(a.indexOf("Java"));
System.out.println(a.isEmpty());
System.out.println(a.size());
	}

}
