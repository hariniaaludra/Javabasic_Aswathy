package topic3;
interface Interface {
	public void print();
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
