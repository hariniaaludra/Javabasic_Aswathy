package topic2;
class Flowers {
	public void color() {//public void color()
		System.out.println("Flowers are in different colors");
	}
}
class Rose extends Flowers {
	public void rose() {//public void rose()
		System.out.println( "color of Rose is rose");
	}
}
class Lilly extends Flowers {
	public void white() {//public void white()
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
