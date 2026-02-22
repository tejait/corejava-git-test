package java8;

public class ProtoType {
int id;
String name;
public ProtoType(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

public static void main(String[] args) {
	
	ProtoType p1=new ProtoType(100, "AAA");
	ProtoType p2=new ProtoType(101, "BBB");
	ProtoType p3=new ProtoType(102, "ccc");
	System.out.println(p1);
	System.out.println(p2);
	System.out.println(p3);
}
}
