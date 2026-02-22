package collect;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapTest {
	
public void hashMapTest() {
	//k-key  v-value
	// <> - generic- 
	//      k-PAN   v-name
	Map<String, String> map=new HashMap<String, String>();
	                    map.put("RNK123A", "Ramakrishna");
	                    map.put("KA1234N", "Kalyan");  // 5
	                    map.put("S4342AI", "Sai");// 12345
	                    map.put("R244NJT", "Ranjith"); //12345
	                    map.put("A5634SH", "Abhilash");
	                    
	                 //5   map.put("KA1234N", "Sunil"); // doesn't allow duplicate keys- if provide it will override
	                    map.put("KA1234N", "Sunil");
	                    map.put("K21234N", "Sunil");// allows duplicate values
	                    map.put("K31234N", "Sunil");
	                    
	                    map.put(null, "sriram");// allows one null key
	                    map.put(null, "maruthi");
	                    
	                    map.put("A1234CD", null);
	                    map.put("B123434", null);// allows multiple null values
	                    
	        for(Entry<String, String> entry:map.entrySet()) {
	        	// System.out.println(entry);
	        	System.out.println(entry.getKey()+"           "+entry.getValue());
	         }           
}

public void linkedHashMapTest() {
	Map<Integer, String> map=new LinkedHashMap<Integer, String>();
	                     map.put(11, "AA");
	                     map.put(22, "BB");
	                     map.put(33, "cc");
	                     map.put(null, "KK");
	                     map.remove(33);
	                     
	                     System.out.println(map.get(22));
	                     
	                     for(Entry<Integer, String> entry:map.entrySet()) {
	                    	System.out.println(entry.getKey()+"   "+entry.getValue()); 
	                     }
}

public void treemapTest() {
	Map<Integer, String> map=new TreeMap<>();
	                    map.put(33, "AA");
	                    map.put(55, "kk");
	                    map.put(66, "rr");
	                    map.put(11, "uu");
	                    map.put(22, "yy");
	                    map.put(11, "LL");
	                    //map.put(null, "ABCD"); treemap doesn't allows null key
	                    map.put(44, null);
	                    for(Entry<Integer, String> entry:map.entrySet()) {
	                    	System.out.println(entry.getKey()+"   "+entry.getValue());
	                    }
}

public void hashTableTest() {
	Hashtable<Integer, String> map=new Hashtable<Integer, String>();
	 map.put(33, "AA");
     map.put(55, "kk");
     map.put(66, "rr");
     map.put(11, "uu");
     map.put(22, "yy");
     map.put(11, "LL");
   //  map.put(null, "ABCD"); //hashtable doesn't allows null key
   //  map.put(44, null); // hashtable doesn't allows null values
     for(Entry<Integer, String> entry:map.entrySet()) {
     	System.out.println(entry.getKey()+"   "+entry.getValue());
     }

}
public static void main(String[] args) {
	MapTest mt=new MapTest();
	       // mt.hashMapTest();
	//mt.linkedHashMapTest();
	//mt.treemapTest();
	mt.hashTableTest();
}
}
