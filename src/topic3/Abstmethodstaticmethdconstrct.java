package topic3;
abstract class Vehicle{
	void Vehicle() {//the method should be in public void vehicle
		System.out.println("car,bus,bike");
	}
	abstract void car();
	void bike() {//public void bike()
		System.out.println("bike has two wheels");
	}
}
class V extends Vehicle {
	void car() {//public void car()
		System.out.println("car has four wheels");
	}
	
}
public class Abstmethodstaticmethdconstrct {

	public static void main(String[] args) {
		Vehicle a1 =new V();
		a1.bike();
		a1.car();
	}
}
