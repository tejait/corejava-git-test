package collect;

public class ArrayTest {
	public static void main(String[] args) {
	
		int []arr=new int[5];
		      arr[0]=11;
		      arr[1]=22;
		      arr[2]=33;
		      arr[3]=44;
		      arr[4]=55;
		      //arr[5]=66;      
		   System.out.println(arr[0]);
		   System.out.println(arr[1]);
		   System.out.println(arr[2]);
		   System.out.println(arr[3]);
		   System.out.println(arr[4]);
		 //  System.out.println(arr[5]);
		 System.out.println("==============================");
		 
		   for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);  
		   }
		   
		System.out.println("=============For each=============");   
		   
		   for(int val:arr) {// 5 elements - datatype
			  System.out.println(val); 
		   }
		   
		   
	}
}
