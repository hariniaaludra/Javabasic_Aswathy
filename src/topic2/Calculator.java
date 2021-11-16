package topic2;
public class Calculator {
	int num1;
	int num2;
	public Calculator(int x,int y) {
		num1=x;
		num2=y;
	}
	public void add() {
		System.out.println(num1+num2);
	}
	public void sub() {
		System.out.println(num1-num2);
	}
	public void mul() {
		System.out.println(num1*num2);
	}
	public void div() {
		System.out.println(num1/num2);
	}
	
}
