package stringhandling;

import java.util.StringTokenizer;

public class Strtokenizercounttokens {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Hello Everyone Have a nice day", " ");
		System.out.println("Total number of Tokens: " + st.countTokens());

	}

}
