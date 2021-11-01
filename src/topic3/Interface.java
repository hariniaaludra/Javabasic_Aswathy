package topic3;
interface Interface {//there is no main class in this program use main class
	void print();//you can also use public void print()
}
class Facebook implements Interface {
	 public void print() {
		System.out.println("hello");
	}
public static void main(String[] args) {
	Facebook f1 = new Facebook();
	f1.print();
}
}