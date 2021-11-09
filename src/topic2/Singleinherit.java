package topic2;
class Employee {
<<<<<<< HEAD
	public void salary() {
=======
	public void salary() {//public void
>>>>>>> 1917372b731019b674b4f90476ea13687c02b38a
		float s = 20000;
		System.out.println("Employee salary is " + s);
	}
}
class Programmer extends Employee {
<<<<<<< HEAD
	public void bonus() {
=======
	public void bonus() {//public void
>>>>>>> 1917372b731019b674b4f90476ea13687c02b38a
		float b = 5000;
		System.out.println("Programmer salary is " + b);
		}
}
public class Singleinherit {
	public static void main(String[] args) {
		Programmer p = new Programmer();
		p.salary();
		p.bonus();
		
	}

}
