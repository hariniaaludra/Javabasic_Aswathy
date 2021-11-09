package topic2;
class Employee1 {
<<<<<<< HEAD
	public void salary() {
=======
	public void salary() {//you can also use public void salary()
>>>>>>> 1917372b731019b674b4f90476ea13687c02b38a
		float s = 20000;
		System.out.println("Employee salary is " + s);
	}
}
class Programmer1 extends Employee1 {
<<<<<<< HEAD
	public void bonus() {
=======
	public void bonus() {//public void()
>>>>>>> 1917372b731019b674b4f90476ea13687c02b38a
		float b = 5000;
		System.out.println("Programmer salary is " + b);
		}
}
class Developer extends Programmer1 {
<<<<<<< HEAD
	public void sal() {
=======
	public void sal() {//public void()
>>>>>>> 1917372b731019b674b4f90476ea13687c02b38a
		float d = 15000;
		System.out.println("Developer salary is " + d);
	}
}
public class multilevelinherit {
	public static void main(String[] args) {
		Developer dev = new Developer();
		dev.bonus();
		dev.sal();
		dev.salary();
	

	}

}
