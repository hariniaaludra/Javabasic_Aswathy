package topic3;
interface Interface {
	void print();
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