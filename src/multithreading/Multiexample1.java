package multithreading;

public class Multiexample1 extends Thread {
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		Multiexample1 t1 = new Multiexample1();
		t1.start();

	}
}