package topic2;
class Class1 {
	static void distance(int s,int t) {
		int d;
		d=s*t;
		System.out.println(d);
		}
	int formula(int a,int b)
	{
		
		return a+b;
	}
	
}
public class Task {
	public static void main(String[] args) {
		Class1 Obj=new Class1();
		Obj.distance(5,6);
		int c =Obj.formula(5,2);
		System.out.println("a+b=" + c);
	}

}
