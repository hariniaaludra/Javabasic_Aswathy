package topic3;
interface A1 {
<<<<<<< HEAD
	public void one();
}
abstract class A2 implements A1 {
	abstract void Two();
	public void three () {
=======
	public void one();//using public void one();
}
abstract class A2 implements A1 {
	abstract void Two();
	public void three () {//you can also use public void three()
>>>>>>> 1917372b731019b674b4f90476ea13687c02b38a
		System.out.println("hi three");
	}
}
class A3 extends A2 {
	public void one() {
		System.out.println("hi one");
	}
	public void Two() {
		System.out.println("hi two");
	}
}
public class Class1 {

	public static void main(String[] args) {
		A3 mobj =  new A3();
		mobj.one();
		mobj.Two();
	}

}
