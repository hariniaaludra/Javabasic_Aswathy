import java.util.Scanner;

public class Ifelseifcondition {
		public static void main(String[] args) {
			
			Scanner iObj = new Scanner(System.in);
			System.out.print("Enter your mark=");
			int mark = iObj.nextInt();
			if( mark==50) {
				System.out.println("your mark is average");
			}
			else if( mark>50)
			{
				System.out.println("your mark is above average ");
			}
			else
			{
				System.out.println("your mark is below average");
				
			}
			
			
		}

	}
