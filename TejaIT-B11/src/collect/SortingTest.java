package collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingTest {
public static void main(String[] args) {
	
	List<Integer> list=new ArrayList<Integer>();
					list.add(12);
					list.add(16);
					list.add(14);
					list.add(11);
					list.add(15);
					
		Collections.sort(list);	
		
		for(Integer i:list) {
			System.out.println(i);
		}
	
}
}
