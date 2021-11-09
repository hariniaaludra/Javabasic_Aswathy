package topic2;

class Set {
<<<<<<< HEAD
	private String name;
=======
    private String name;//you can also use private String name;
>>>>>>> 1917372b731019b674b4f90476ea13687c02b38a
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