package multithreading;

public class Multiexample extends Thread { //class name changed
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		Multiexample t1 = new Multiexample();
		t1.start();

	}
}