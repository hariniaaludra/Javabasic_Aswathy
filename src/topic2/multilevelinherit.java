package topic2;
class Employee1 {
	void salary() {
		float s = 20000;
		System.out.println("Employee salary is " + s);
	}
}
class Programmer1 extends Employee1 {
	void bonus() {
		float b = 5000;
		System.out.println("Programmer salary is " + b);
		}
}
class Developer extends Programmer1 {
	void sal() {
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