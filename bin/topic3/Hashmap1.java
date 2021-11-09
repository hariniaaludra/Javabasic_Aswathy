package topic3;

import java.util.HashMap;

public class Hashmap1 {

	public static void main(String[] args) {
		HashMap<String,String> capitalcities = new 	HashMap<String,String>();
		capitalcities.put("England","London");
		capitalcities.put("USA","Washington DC");
		capitalcities.put("Germany", "Berlin");
		capitalcities.put("Netherland","Amsterdam");
		capitalcities.get("England");
		capitalcities.remove("USA");
		for(String i:capitalcities.keySet())
		System.out.println(i);
	}

}
