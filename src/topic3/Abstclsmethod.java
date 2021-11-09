package topic3;
abstract class Shape {
	abstract void draw();
}
class Rectangle extends Shape {
<<<<<<< HEAD
	public void draw() {
=======
	 public void draw() {//you can also use public void 
>>>>>>> 1917372b731019b674b4f90476ea13687c02b38a
		System.out.println("Draw rectangle");
	}
}
class Triangle extends Shape {
<<<<<<< HEAD
		public void draw() {
=======
		 public void draw() {//public void
>>>>>>> 1917372b731019b674b4f90476ea13687c02b38a
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
