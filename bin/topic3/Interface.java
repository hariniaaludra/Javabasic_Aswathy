package topic3;
<<<<<<< HEAD
interface Interface {
	public void print();
=======
interface Interface {//there is no main class in this program use main class
	public void print();//you can also use public void print()
>>>>>>> 1917372b731019b674b4f90476ea13687c02b38a
}
class Facebook implements Interface {
	 public void print() {
		System.out.println("hello");
	}
}
class Main{
public static void main(String[] args) {
	Facebook f1 = new Facebook();
	f1.print();
}
}