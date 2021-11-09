package topic3;

import java.util.LinkedList;
import java.util.Iterator;

public class Iterator1 {

	public static void main(String[] args) {
		LinkedList<Integer> mynumber = new LinkedList<Integer>();
		mynumber.add(55);
		mynumber.add(44);
		mynumber.add(33);
		mynumber.add(66);
		mynumber.add(11);
		Iterator<Integer> it = mynumber.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());
	}

}

}