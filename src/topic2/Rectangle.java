package topic2;

class Area {
	int len,wid;
	public void insert(int i,int w) {// you can also use public void insert(int i,int w)
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
