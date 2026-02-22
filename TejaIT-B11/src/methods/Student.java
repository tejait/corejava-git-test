package methods;

public class Student {
	
     //76& above 1st class
	// 51-75:2nd class
	// 35-50: 3rd class
	//35 below- fail
	
	public void marks() {
		int marks=50;
		
       if(marks<=100 &&marks>75) { // 100-76 
    	   System.out.println("1st class..");
       }else if(marks<=75 && marks>50){ // 75& below- 51 range
    	   System.out.println("2nd class");
       }else if(marks<=50 && marks>=35){ // 50eqaul& below && 35 equal
    	   System.out.println("3rd class");
       }else {
    	  System.out.println("student failed..."); 
       }	
	}
	
	public static void main(String[] args) {
		Student s1=new Student();
		        s1.marks();
	}
} 
