package topic2;

class Noparameterconstr {
	int i;
	private  Noparameterconstr() {//using private Noparameterconstr()
		i=25;
		System.out.println("Constructor is called:");
	}
public static void main(String[] args) {
	Noparameterconstr obj = new Noparameterconstr();
	System.out.println("The value of the constructor is " + obj.i);
	}
}
