package topic3;
interface Finterface {
	public void fmethod();
}
interface Sinterface {
	public void smethod();
}
class Aclass implements Finterface,Sinterface {
	public void fmethod() {
		System.out.println("This is First method");
	}
	public void smethod() {
		System.out.println("This is Second method");
	}
}
public class Multipleinterface {

	public static void main(String[] args) {
		Aclass ac =new Aclass();
		ac.fmethod();
		ac.smethod();

	}

}