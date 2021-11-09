package topic3;
abstract class Shape {
	abstract void draw();
}
class Rectangle extends Shape {
	public void draw() {
		System.out.println("Draw rectangle");
	}
}
class Triangle extends Shape {
		public void draw() {
			System.out.println("Draw square");
		}
	}
public class Abstclsmethod {

	public static void main(String[] args) {
		Shape s1= new Rectangle();
		s1.draw();
		Shape s2=new Triangle();
		s2.draw();
	}

}
