package topic2;

public class Construct {
	private String name;// you can also use private String name;
	Construct() {
		System.out.println("Constructor called");
		 name = "default";// you can also use String name="default";
	}
public static void main(String[] args) {
	Construct obj = new Construct();
	System.out.println("This is a" + obj.name + "Constructor");
		
	}
	

}
