package topic2;

public class IFelsemethod {
<<<<<<< HEAD
	static void checkage(int age) {
=======
	static void checkage(int age) {//method should be in small letter checkage(int age)
>>>>>>> 1917372b731019b674b4f90476ea13687c02b38a
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
