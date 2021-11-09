package multithreading;

class Multiexample extends Thread{
	public void run() {
		for (i=1,i<5;i++) {
			try {
				Thread.sleep(500);
			}
			catch (InterruptedException e) {
				System.out.println(e);}
			}
			}
		public static void main(String args[]) {
			Multiexample m1=new Multiexample();
			Multiexample m2=new Multiexample();
			m1.run();
			m2.run();
		}
		
}

