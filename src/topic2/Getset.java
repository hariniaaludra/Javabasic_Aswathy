package topic2;

class Set {
	private String name;
	public String GetName() {
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
	System.out.println(Obja.GetName());
}
}