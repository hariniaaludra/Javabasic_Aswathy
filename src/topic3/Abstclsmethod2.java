package topic3;
abstract class Bank {
	abstract int interest();
}
class Sbi extends Bank {
	public int interest() {
		return 7;
	}
}
class Hdfc  extends Bank {
	public int interest() {
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
