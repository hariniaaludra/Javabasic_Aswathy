
public class ReversedString {

	public static void main(String[] args) {
		String name ="aswathy";
		String reversedString="";
		for(int i = name.length() - 1;i >= 0;i--)
			reversedString = reversedString + name.charAt(i);
		{
		System.out.println("The reversed string of the ''' + name + ''' is:");
		}
		System.out.println(reversedString);
	}

}
