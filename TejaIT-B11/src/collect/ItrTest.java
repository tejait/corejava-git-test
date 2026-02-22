package collect;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ItrTest {

	public void arrayListTest() {
		
		List<Integer> list=new ArrayList<Integer>();
					  list.add(12);
					  list.add(14);
					  list.add(16);
					  list.add(18);
					  list.add(20);
		  
          Iterator<Integer> itr=list.iterator();// proper sequence
                             // 12  14  16  18  20 
			          while(itr.hasNext()) { // boolean       condtion= boolean   12>14  2==30
			        	     Integer val=itr.next(); //will return the element 
			        	     System.out.println(val); // 12 14  16  18  20
			          }
          
	}
	
	public void listIteratorTest() {
		List<Integer> list=new ArrayList<Integer>();
		  list.add(12);
		  list.add(14);
		  list.add(16);
		  list.add(18);
		  list.add(20);
		// traverse data from forward direction to backward direction
		  
		  ListIterator<Integer> listItr=list.listIterator();
		               while(listItr.hasNext()) {
		            	   Integer val=listItr.next();
		            	   System.out.println(val);
		               }
		               
		          System.out.println("============================");  
		          
		          while(listItr.hasPrevious()) {
		        	  Integer val=listItr.previous();
		        	  System.out.println(val);
		          }
	}
	
	public void enumerationTest() {
		Vector<Integer> ve=new Vector<Integer>();
		                ve.add(12);
		                ve.add(15);
		                ve.add(18);
		                ve.add(19);
		                ve.add(22);
		                
		 Enumeration<Integer> enu=ve.elements(); // proper sequence
		                
		                while(enu.hasMoreElements()) {// value is available or not for iteration
		                	  Integer val=enu.nextElement(); //will return the element
		                	  System.out.println(val);
		                }
		                
	}
	
	public static void main(String[] args) {
		ItrTest itr=new ItrTest();
		    // itr.arrayListTest();
		//itr.enumerationTest();
		itr.listIteratorTest();
	}
}
