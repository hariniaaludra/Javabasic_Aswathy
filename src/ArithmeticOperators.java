import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) { 
		Scanner iObj = new Scanner(System.in);
		System.out.println("Enter the first num=");
		int num1 = iObj.nextInt();
		System.out.println("Enter the second num= ");
		int num2 = iObj.nextInt();
		System.out.println("num1 + num2="  + (num1 + num2));
		System.out.println("num1 - num2="  + (num1 - num2));
		System.out.println("num1 * num2="  + (num1 * num2));
		System.out.println("num1 / num2="  + (num1 / num2));
		System.out.println("num1 % num2="  + (num1 % num2));
		System.out.println("num1 >> num2=" + (num1 >> num2));
		System.out.println("num1 << num2=" + (num1 << num2));
		System.out.println(num1++);
		System.out.println(num2--);
		System.out.println(++num1);
		System.out.println(--num2);
		
	}

}
