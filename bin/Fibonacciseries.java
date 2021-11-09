import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("Enter num1=");
		int num1 = a.nextInt();
		System.out.print("Enter num2=");
		int num2 = a.nextInt();
		int num3,i,count=10;
		System.out.print(num1 + " " +num2);
		for(i=1;i<=10;++i) {
			num3= num1+num2;
			System.out.print(" "+ num3);
			num1=num2;
			num2=num3;
		}
		

	}

}
