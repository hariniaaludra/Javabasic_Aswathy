package topic2;

public class Methodoverloading {
	static int add(int a, int b)
	{
		return(a+b);
	}
	static double add(double a, double b) {
		return (a+b);
	}
	public static void main(String[] args) {
		int sum1 = add(8, 2);
		double sum2 = add(1.2, 1.8 );
		System.out.println("sum1= " + sum1);
		System.out.println("sum2= " + sum2);
		
	}
}