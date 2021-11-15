package hackerranker;

import java.util.HashMap;
import java.util.Scanner;

public class Map1 {
	public static void main(String []argh)
	{
        HashMap<String,Integer> map = new HashMap<String,Integer>();
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            map.put(name,phone);
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
		try
            {
                int out=map.get(s);
                System.out.println(s+"="+out);
            }
            catch(Exception e)
            {
                System.out.println("Not found");
            }
        }
    }
}


