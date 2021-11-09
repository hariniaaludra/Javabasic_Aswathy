package topic2;
class Employee {
	public void salary() {
		float s = 20000;
		System.out.println("Employee salary is " + s);
	}
}
class Programmer extends Employee {
	public void bonus() {
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
