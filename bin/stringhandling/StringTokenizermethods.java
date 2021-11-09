package stringhandling;

import java.util.StringTokenizer;

public class StringTokenizermethods {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("my name is sam", " ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			StringTokenizer st1 = new StringTokenizer("Hello everyone I am a Java developer", " ");
			while (st1.hasMoreElements()) {
				System.out.println(st1.nextToken());

			}

		}
	}
}