package collect;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

import javax.management.Query;

public class ListTest {

	public void arrayListTest() {
		ArrayList<Integer> al=new ArrayList<Integer>();
		                   al.add(12);// we can add the elements
		                   al.add(22);
		                   al.add(32);
		                   al.add(42);
		              System.out.println(al.get(2)); // read the element using get method
		              
		              al.add(1, 67);
		              al.remove(4); // to remove the element from the list
		                   System.out.println("===============");
		           for(Integer val:al) {
		        	  System.out.println(val); 
		           }        
		        
	}
	
	
	public void linkedListTest() {
		LinkedList<String> lt=new LinkedList<String>();
		                  lt.add("AA");// new node will create
		                  lt.add("bb");
		                  lt.add("cc");
		                  lt.add("DD");
		                  System.out.println(lt.get(2));
		                  lt.add(2, "kk");
		                  lt.remove(1);
		    System.out.println("====================");
		           for(String val:lt) {
		        	  System.out.println(val); 
		           }       
		         
	}
	
	public void vectorTest() {
		List<Integer> vector=new Vector<Integer>();
						vector.add(12);
						vector.add(15);
						vector.add(17);
						vector.add(19);
						vector.add(27);
		
		for(Integer val:vector) {
			System.out.println(val);
		}
		
	}
	
	public void stackTest() {
		Stack<Integer> sta=new Stack<Integer>();
		               sta.push(11);// adding elements
		               sta.push(12);
		               sta.push(14);
		               sta.push(16);
		               sta.push(19);// last in- first out 
		 System.out.println("============");
		 System.out.println(" peek  "+sta.peek());// it tells which element will be remove
		 sta.pop(); // to remove the element
		 System.out.println("peel  "+sta.peek());
		 sta.pop();
		 System.out.println("============");
		               
		               for(Integer val:sta) {
		            	System.out.println(val);   
		               }
		               	               
	}
	
	public void queueTest() {
		Queue<Integer> q=new PriorityQueue<Integer>();
		               q.add(12);
		               q.add(14);
		               q.add(16);
		               q.add(18);
		               q.add(20);
		               
		               q.remove();
		               q.remove();
		               q.remove();
		               q.remove();
		               
		       for(Integer val:q) {
		    	   System.out.println(val);
		       }        
	}
	
	public void hashSetTest() {
		// it doesn't allows duplicates
		Set<Integer> set=new HashSet<Integer>();
		             set.add(13);
		             set.add(14);
		             set.add(16);
		             set.add(13);
		             set.add(19);
		             set.add(22);
		             set.add(19);
		             set.add(null);
		             for(Integer val:set) {
		            System.out.println(val);	 
		             }
		            
	}
	public static void main(String[] args) {
		ListTest lt=new ListTest();
		        // lt.arrayListTest(); 
		//lt.linkedListTest();
		//lt.vectorTest();
		//lt.stackTest();
		//lt.queueTest();
		lt.hashSetTest();
	}
}
