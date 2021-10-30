package topic3;
class Fruits {
	public void coloroffruits() {
		System.out.println("Fruits are in different color");
	}
}
class Apple extends Fruits {
	public void coloroffruits() {
		System.out.println("Apple is red color");
	}
}
class Orange extends Fruits {
	public void coloroffruits() {
		System.out.println("Orange is orange color");
	}
}
class Mango extends Fruits {
	public void coloroffruits() {
		System.out.println("Mango is yellow color");
	}
}
public class Polymorphism1 {

	public static void main(String[] args) {
		Fruits f1 =new Fruits();
		Fruits a1 =new Apple();
		Fruits o1 =new Orange();
		Fruits m1 =new Mango();
		f1.coloroffruits();
		a1.coloroffruits();
		o1.coloroffruits();
		m1.coloroffruits();
		}
}
