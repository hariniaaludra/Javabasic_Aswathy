package multithreading;

public class Multithreadg  extends Thread{
	public void run() {
		System.out.println("running...");
	}
	public static void main(String args[]) {
		Multithreadg t1 = new Multithreadg();
		t1.start();
		t1.start();
	}

}
