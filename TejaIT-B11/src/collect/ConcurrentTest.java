package collect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentTest {

	public void onMap() {
		Map<Integer, String> map=new ConcurrentHashMap<Integer, String>();
		//Map<Integer, String> map=new HashMap<Integer, String>();
							map.put(12, "bbb");
							map.put(15, "ccc");
							map.put(18, "ddd");
							map.put(21, "eee");
							
							
							for(Entry<Integer, String> entry:map.entrySet()) {
								System.out.println(entry.getKey()+"    "+entry.getValue());
							 map.put(25, "zzz");	
							//	map.remove(18);
							}
							System.out.println("==========================");						
	}
	
	public void onList() {
		List<Integer> list=new CopyOnWriteArrayList<Integer>();
		//List<Integer> list=new ArrayList<Integer>();
		              list.add(12);
		              list.add(14);
		              list.add(16);
		              list.add(18);
		              		              
		              for(Integer val:list) {
		            	System.out.println(val); 
		            	if(val==18) {
		            	list.add(22);
		            	}
		              }
		              
		 System.out.println("========================");
		              
		              for(Integer val:list) {
		            	System.out.println(val);  
		              }
	}
	public static void main(String[] args) {
		ConcurrentTest ct=new ConcurrentTest();
		              //  ct.onMap();
		  				ct.onList();
	}
}
