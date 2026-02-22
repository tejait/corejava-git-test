package loops;

public class SwitchTest {
public static void main(String[] args) {
	
	int id=7; //initialization
	
	switch(id) {
	case 2:
		 System.out.println(" case value2");
		  break;  
	case 5:
		System.out.println("case value 5");
		break;
	case 7:
		System.out.println("case value 7");
		break;
	case 10:
		System.out.println("case value 10");
		break;
	default:
		System.out.println("no input value matched..executed default case.");
		break;
	}
	
}
}
