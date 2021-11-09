package topic2;

public class Parameterconstr {
	 String language;
	 Parameterconstr(String lan) {
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
