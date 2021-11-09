package topic2;

public class Construct {
	public String name;
	public Construct() {
		System.out.println("Constructor called");
		String name = "default";
	}
public static void main(String[] args) {
	Construct obj = new Construct();
	System.out.println("This is a " + obj.name + "Constructor");
		
	}
	

}
