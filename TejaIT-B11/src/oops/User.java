package oops;

public class User extends UserData{
int id; //instance
String name;

public User(int id, String name) {// id - local
	super();
	this.id = id;
	this.name = name;
}

public User() {
	
}
public static void main(String[] args) {
	User u1=new User(11, "AAA");
	
}

}
