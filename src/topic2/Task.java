package topic2;
class Class1 {
	  public static void task(int p,int q) {
		System.out.println(p+q);
		}
<<<<<<< HEAD
	  public int formula(int a,int b)
=======
	  public int formula(int a,int b)//also use public int formula(int a,int b)
>>>>>>> 1917372b731019b674b4f90476ea13687c02b38a
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
