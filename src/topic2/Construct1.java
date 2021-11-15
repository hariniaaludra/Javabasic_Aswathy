package topic2;

public class Construct1 {
	public String name;
	public Construct1() {
		System.out.println("Constructor called");
		String name = "default";
	}
public static void main(String[] args) {
	Construct1 obj = new Construct1();
	System.out.println("This is a " + obj.name + "Constructor");
		
	}
	

}
