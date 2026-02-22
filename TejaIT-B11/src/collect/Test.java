package collect;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test {
public void array() {
	List<Integer> list=new CopyOnWriteArrayList<Integer>();
	              list.add(12);
	              list.add(13);
	              list.add(14);
Iterator<Integer> itr=list.iterator();

				while (itr.hasNext()) {
					System.out.println(itr.next());
					list.add(16);
				}
				System.out.println("===========");
				Iterator<Integer> itr2=list.iterator();
				while (itr2.hasNext()) {
					System.out.println(itr2.next());
					
				}
}

public static void main(String[] args) {
	Test t=new  Test();
	t.array();
}
}
