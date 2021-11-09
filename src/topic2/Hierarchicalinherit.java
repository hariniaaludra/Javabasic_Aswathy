package topic2;
class Flowers {
<<<<<<< HEAD
	public void color() {
=======
	public void color() {//public void color()
>>>>>>> 1917372b731019b674b4f90476ea13687c02b38a
		System.out.println("Flowers are in different colors");
	}
}
class Rose extends Flowers {
<<<<<<< HEAD
	public void rose() {
=======
	public void rose() {//public void rose()
>>>>>>> 1917372b731019b674b4f90476ea13687c02b38a
		System.out.println( "color of Rose is rose");
	}
}
class Lilly extends Flowers {
<<<<<<< HEAD
	public void white() {
=======
	public void white() {//public void white()
>>>>>>> 1917372b731019b674b4f90476ea13687c02b38a
		System.out.println("color of Lilly is white");
	}
}
	
public class Hierarchicalinherit {

	public static void main(String[] args) {
		Lilly B1 = new Lilly();
		B1.color();
		B1.white();
		}

}
