package topic2;

public class Construct {
<<<<<<< HEAD
	public String name;
	public Construct() {
		System.out.println("Constructor called");
		String name = "default";
=======
	private String name;// you can also use private String name;
	Construct() {
		System.out.println("Constructor called");
		 name = "default";// you can also use String name="default";
>>>>>>> 1917372b731019b674b4f90476ea13687c02b38a
	}
public static void main(String[] args) {
	Construct obj = new Construct();
	System.out.println("This is a " + obj.name + "Constructor");
		
	}
	

}
