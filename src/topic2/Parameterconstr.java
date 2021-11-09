package topic2;

public class Parameterconstr {
<<<<<<< HEAD
	 String language;
	 Parameterconstr(String lan) {
=======
	String language;//you can also use private String language
	 Parameterconstr(String lan) {//also use private parameterconstr(String lan)
>>>>>>> 1917372b731019b674b4f90476ea13687c02b38a
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
