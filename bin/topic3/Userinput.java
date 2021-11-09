package topic3;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		Scanner myobj = new Scanner(System.in);
		System.out.print("Enter your name:");
		String name = myobj.nextLine();
		System.out.print("Enter your age:");
		int age = myobj.nextInt();
		System.out.print("Enter your phone number:");
		int phno = myobj.nextInt();
		System.out.print("Enter your address:");
		String add = myobj.next();
		
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Phno:" + phno);
		System.out.println("Address:" + add);
	}

}
