package topic2;

class Noparameterconstr2 {
	int abc;
	 public Noparameterconstr2() {//using public Noparameterconstr2()
		abc = 9;	
	}
}
class B {
public static void main(String[] args) {
	Noparameterconstr2 obj1 = new Noparameterconstr2();
	System.out.println("value of a" + obj1.abc);
}
	
}
