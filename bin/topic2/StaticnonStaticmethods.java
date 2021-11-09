package topic2;

public class StaticnonStaticmethods {
	static void mystatic() {
		System.out.println("This is static method");
	}
	public void mypublic() {
		System.out.println("This is public method");
	}

	public static void main(String[] args) {
		mystatic();
		StaticnonStaticmethods obj = new StaticnonStaticmethods();
		obj.mypublic();
	}

}
