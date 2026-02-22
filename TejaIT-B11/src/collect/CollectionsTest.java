package collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsTest {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<Integer>();
					list.add(12);
					list.add(16);
					list.add(14);
					list.add(11);
					list.add(15);
					
//Collections.sort(list);	

for(Integer i:list) {
System.out.println(i);
}

Object[] array=list.toArray(); // convert list to Array

List<Object> listArr=Arrays.asList(array); // convert Array to arrayList

System.out.println("max value  "+Collections.max(list));
System.out.println("min value  "+Collections.min(list));
System.out.println("====================");
Collections.reverse(list);

for(Integer i:list) {
	System.out.println(i);
}

ArrayList<Integer> list1=new ArrayList<Integer>();// Asynchronus
List<Integer> syncList=Collections.synchronizedList(list1); // synchronized list

Set<String> set=new HashSet<String>();// asynchronus
Set<String> syncSet=Collections.synchronizedSet(set);

Map<Integer, String> map=new HashMap<Integer, String>();// asynchronus
Map<Integer, String> syncMap=Collections.synchronizedMap(map);


Integer i=10;
Integer k=10;
System.out.println(" Integer compareTo ========        "+i.compareTo(k));
//smaller value    -1
// large value     +1
// if values are equal 0

String s1="abc";
String s2="bca";
System.out.println("String comapare   "+s1.compareTo(s2));

}


}
