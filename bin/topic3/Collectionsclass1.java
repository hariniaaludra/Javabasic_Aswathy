package topic3;
 import java.util.*;
public class Collectionsclass1 {

	public static void main(String[] args) {
		ArrayList <String> student = new ArrayList<String>();
		student.add("sam");
		student.add("ram");
		student.add("raj");
		student.add("veer");
		student.add("tahir");
		Collections.sort(student);
		Iterator<String> itr = student.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}

	}

}
