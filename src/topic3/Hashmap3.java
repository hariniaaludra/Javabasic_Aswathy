package topic3;

import java.util.HashMap;

public class Hashmap3 {

	public static void main(String[] args) {
		HashMap<Integer, String> obj = new HashMap<Integer, String>();
		obj.put(100, "Amit");
		obj.put(101, "Vijay");
		obj.put(102, "Rahul");
		obj.put(103, "Gaurav");
		System.out.println("Initial list of elements: " + obj);
		// key-based removal
		obj.remove(100);
		System.out.println("Updated list of elements: " + obj);
		// value-based removal
		obj.remove(101);
		System.out.println("Updated list of elements: " + obj);
		// key-value pair based removal
		obj.remove(102, "Rahul");
		System.out.println("Updated list of elements: " + obj);
	}
}
