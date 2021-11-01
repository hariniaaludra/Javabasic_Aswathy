package topic3;
abstract class Shape {
	abstract void draw();
}
class Rectangle extends Shape {
	 void draw() {//you can also use public void 
		System.out.println("Draw rectangle");
	}
}
class Triangle extends Shape {
		 void draw() {//public void
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
