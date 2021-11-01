package topic2;

public class Parameterconstr {
	String language;//you can also use private String language
	Parameterconstr(String lan) {//also use private parameterconstr(String lan)
		language = lan;
		System.out.println(language +  "  "
				+ "programming language.");
	}
	public static void main(String[] args) {
		Parameterconstr myob = new Parameterconstr("Java");
		Parameterconstr myob1 = new Parameterconstr("C++");
		Parameterconstr myob2 = new Parameterconstr("Python");
		
	}

}
