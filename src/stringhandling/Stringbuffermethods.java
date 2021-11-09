package stringhandling;

public class Stringbuffermethods {

	public static void main(String[] args) {
		StringBuffer dog = new StringBuffer("Dog says");
		dog.append("Bow Bow");
		System.out.println(dog);
		StringBuffer cat = new StringBuffer("Cat says ");
		cat.insert(9, "Meow Meow");
		System.out.println(cat);
		StringBuffer duck = new StringBuffer("Duck says bow");
		duck.replace(10, 13, "Quack Quack");
		System.out.println(duck);
		StringBuffer cow = new StringBuffer("Cow says Moo boo Moo");
		cow.delete(13, 16);
		System.out.println(cow);
		StringBuffer dog1 = new StringBuffer(" dog says Bow Bow ");
		dog1.reverse();
		System.out.println(dog1);

	}
}