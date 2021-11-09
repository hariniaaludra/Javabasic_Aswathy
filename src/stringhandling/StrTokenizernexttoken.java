package stringhandling;

import java.util.StringTokenizer;

public class StrTokenizernexttoken {

	public static void main(String[] args) {
		  StringTokenizer st = new StringTokenizer("my name,is,khan");   
	      System.out.println("Next token is : " + st.nextToken(","));  

	}

}
