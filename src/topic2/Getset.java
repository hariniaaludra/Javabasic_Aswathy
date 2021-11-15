package topic2;

class Set {
	int A;

    private String name;//you can also use private String name;

	public String getName() { //method name start with lowercase
		return name;
	}
	public void SetName(String Nname) {
		this.name = Nname;
	}

}
public class Getset {
	public static void main(String[] args) {
	Set Obja = new Set();
	Obja.SetName("java");
	System.out.println(Obja.getName());
}
}