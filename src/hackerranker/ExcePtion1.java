package hackerranker;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcePtion1 {
	 public static void main(String[] args) {
	 try {
	        Scanner obj=new Scanner (System.in);
	        System.out.println(" ");
	        int x=obj.nextInt();
	        System.out.println(" ");
	        int y=obj.nextInt();
	        int div=x/y;
	        System.out.println(div);
	        }
	         catch(InputMismatchException e) 
	         {
	             System.out.println(e);
	         }  
	         catch(ArithmeticException e1)
	         {
	             System.out.println(e1);
	         }
	         
	        }
}

