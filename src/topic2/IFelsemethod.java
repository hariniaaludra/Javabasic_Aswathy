package topic2;

public class IFelsemethod {

	static void checkage(int age) {//method should be in small letter checkage(int age)

		if (age<18) {
			System.out.println("Access denied - you are not old enough!");
		}
		else {
			System.out.println("Access granted - you are old enough");
		}
	}
	public static void main(String[] args) {
		checkage(50);
	}

}
