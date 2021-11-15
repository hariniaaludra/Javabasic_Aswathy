package topic2;

public class Construct1 {
	private String name; // it should declare in private
	public Construct1() {
		System.out.println("Constructor called");
		String name = "default";
	}
public static void main(String[] args) {
	Construct1 obj = new Construct1();
	System.out.println("This is a " + obj.name + "Constructor");
		
	}
	

}
