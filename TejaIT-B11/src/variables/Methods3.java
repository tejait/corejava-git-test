package variables;

public class Methods3 {

	public byte id() {
		byte id=123; 
		return id;
	}
	public int bill() {
		int bottle=100;
		int pen=100;
		int bill=bottle+pen;//100+100
		return bill;
	}
	public String name() {
		String fname="charan";
		String lname="konidela";
		String fullname=fname+lname; // charan+konidela
		return fullname;
	}
	
	public boolean areYouIndina() {
		boolean i=true;
		return i;
	}
	public static void main(String[] args) {
		Methods3 m3=new Methods3();
		System.out.println(m3.id());
		System.out.println(m3.name());
	}
}
