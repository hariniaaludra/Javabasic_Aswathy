package topic2;

class Area {
	int len,wid;
<<<<<<< HEAD
	public void insert(int i,int w) {
=======
	public void insert(int i,int w) {// you can also use public void insert(int i,int w)
>>>>>>> 1917372b731019b674b4f90476ea13687c02b38a
	len=i;
	wid=w;
}
void calculatearea() {
	System.out.println(len*wid);
}
}
public class Rectangle {
	public static void main(String[] args) {
		Area obj = new Area();
		obj.insert(15, 7);
		obj.calculatearea();
		

	}

}
