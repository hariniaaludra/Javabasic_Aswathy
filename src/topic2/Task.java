package topic2;
class Class1 {
	  public static void task(int p,int q) {
		System.out.println(p+q);
		}
	  int formula(int a,int b)//also use public int formula(int a,int b)
	{
		return a+b;
	}
	
}
public class Task {
	public static void main(String[] args) {
		Class1.task(5,9);
		Class1 Obj=new Class1();
		int c =Obj.formula(5,2);
		System.out.println("a+b=" + c);
	}
}
