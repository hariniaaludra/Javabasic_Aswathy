package topic3;
abstract class Vehicle{
	 Vehicle() {//the method should be in public void vehicle
		System.out.println("car,bus,bike");
	}
	abstract void car();
<<<<<<< HEAD
	public void bike() {
=======
	public void bike() {//public void bike()
>>>>>>> 1917372b731019b674b4f90476ea13687c02b38a
		System.out.println("bike has two wheels");
	}
}
class V extends Vehicle {
<<<<<<< HEAD
	public void car() {
=======
	public void car() {//public void car()
>>>>>>> 1917372b731019b674b4f90476ea13687c02b38a
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
