package multithreading;

public class Multiexample2 implements Runnable {
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		Multiexample2 m1 = new Multiexample2();
		Thread t1 = new Thread(m1); // Using the constructor Thread(Runnable r)
		t1.start();
	}
}
