package topic3;

import java.util.LinkedList;
import java.util.Collections;
public class Linkedlist1 {

	public static void main(String[] args) {
		LinkedList<Integer> mynumber = new LinkedList<Integer>();
		mynumber.add(55);
		mynumber.add(44);
		mynumber.add(33);
		mynumber.add(66);
		mynumber.add(11);
		
		Collections.sort(mynumber);
		System.out.println(mynumber);
	}

}
