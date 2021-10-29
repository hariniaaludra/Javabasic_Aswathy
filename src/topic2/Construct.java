package topic2;

public class Construct {
	String name;
	Construct() {
		System.out.println("Constructor called");
		name = "default";
	}
public static void main(String[] args) {
	Construct obj = new Construct();
	System.out.println("This is a" + obj.name + "Constructor");
		
	}
	

}
