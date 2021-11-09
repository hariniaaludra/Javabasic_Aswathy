package topic3;
abstract class Bank {
	abstract int interest();
}
class Sbi extends Bank {
<<<<<<< HEAD
	public int interest() {
=======
	 public int interest() {//you can also use public int interest()
>>>>>>> 1917372b731019b674b4f90476ea13687c02b38a
		return 7;
	}
}
class Hdfc  extends Bank {
<<<<<<< HEAD
	public int interest() {
=======
	public int interest() {//public int interest()
>>>>>>> 1917372b731019b674b4f90476ea13687c02b38a
		return 9;
	}
}
public class Abstclsmethod2 {

	public static void main(String[] args) {
		Bank b1= new Sbi();
		System.out.println("interest in Sbi is " + b1.interest() + "%");
		Bank b2 =new Hdfc();
		System.out.println("interest in Hdfc is " + b2.interest() + "%");
	}

}
