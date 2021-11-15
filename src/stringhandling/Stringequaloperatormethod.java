package stringhandling;

public class Stringequaloperatormethod {

	public static void main(String[] args) {
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		// use .equals function to check the condition
		System.out.println(s1.equals(s2) );// true (because both refer to same instance)
		System.out.println(s1.equals(s3));// false(because s3 refers to instance created in nonpool)
	}

}
