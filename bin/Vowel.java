import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("Enter a string:");
		String str = a.nextLine();
		str = str.toLowerCase();
		int i,vCount=0,cCount=0;
		for(i=0;i<=str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vCount++;
			}
			else if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
				vCount++;
			}
			System.out.println("Total number of vowels=" + vCount);
			System.out.println("Total number of consonants=" + cCount);
		}

	}
}
