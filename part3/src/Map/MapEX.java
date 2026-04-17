package Map;

import java.util.*;
import java.util.Map.Entry;


public class MapEX {
public static void main(String[] args) {
	HashMap<Integer,String> map = new HashMap();
	
	
	// put(object key,object value)
	map.put(1, "One");
	map.put(2, "Two");
	map.put(1, "One");
	map.put(null, "null");
	
	System.out.println(map);
	
	//putAll(map)
	HashMap<Integer,String> map1 = new HashMap();
	map1.put(11, "One");
	map1.put(21, "Two");
	map1.put(11, "One");
	map1.put(null, "null");
	
//	map.putAll(map1);
//	System.out.println(map);
	
	
	// remove(key)
//	map.remove(2);
	// remove(key,value)
	map.remove(null,null);
	
	System.out.println(map);
	
	// clear()
//    map.clear();
//    System.out.println(map);
    
    
    //containsKey(key)
    System.out.println(map.containsKey(2));
    
    
    //replace()
    map.replace(1, "1");
    System.out.println(map);
    
    
    //keySet()
    System.out.println(map.keySet());
    Set<Integer> set = map.keySet();
    System.out.println(set);
    
    //values
    Collection<String> values = map.values();
    System.out.println(values);
    
    
    //entrySet
    Collection entry = map.entrySet();
    System.out.println(entry);
    
    Collection<Entry<Integer, String>> entry1 = map.entrySet();
    System.out.println(entry1);
    
    
    //size()
    System.out.println(map.size());
   
    
    //get
    System.out.println(map.get(2)); //Two
    System.out.println(map.get(8)); // null //key not present then give null
    System.out.println(map.get("three")); //key not present then give null
}
}
