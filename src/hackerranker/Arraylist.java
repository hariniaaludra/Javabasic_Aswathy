package hackerranker;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
	 public static void main(String[] args) {
	        Scanner obj = new Scanner (System.in);
	        int n=obj.nextInt();
	        ArrayList<ArrayList<Integer>> array = new ArrayList<>();
	        for(int i=0;i<n;++i){
	            int m=obj.nextInt();
	            ArrayList<Integer> a1 = new ArrayList<Integer>();
	            for(int j=0;j<m;++j){
	               a1.add(obj.nextInt());
	            }
	            array.add(a1);
	            }
	            int p =obj.nextInt();
	            for(int k=0;k<p;++k){
	            int x=obj.nextInt();
	            int y=obj.nextInt();
	            try{
	              System.out.println(array.get(x-1).get(y-1));
	              }
	              catch(Exception e){
	                  System.out.println("ERROR!");
	                  }
	                  }
	                  }
	                  }


