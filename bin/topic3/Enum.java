package topic3;

<<<<<<< HEAD:src/topic3/Enum.java
public class Enum {
=======
public class Enum {//using Enum
>>>>>>> 1917372b731019b674b4f90476ea13687c02b38a:src/topic3/Enm.java
	public enum Day {SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY}

	public static void main(String[] args) {
		for(Day day:Day.values()) {
			System.out.println(day);
		}
		System.out.println("Today is "+ Day.valueOf("FRIDAY"));
		System.out.println("Index of MONDAY is:" + Day.valueOf("MONDAY").ordinal());
		System.out.println("Index of SUNDAY is:" + Day.valueOf("SUNDAY").ordinal());
		System.out.println("Index of THURSDAY is:" + Day.valueOf("THURSDAY").ordinal());
		System.out.println("Index of SATURDAY is:" + Day.valueOf("SATURDAY").ordinal());
		System.out.println("Index of WEDNESDAY is:" + Day.valueOf("WEDNESDAY").ordinal());
		System.out.println("Index of TUESDAY is:" + Day.valueOf("TUESDAY").ordinal());

	}

}
