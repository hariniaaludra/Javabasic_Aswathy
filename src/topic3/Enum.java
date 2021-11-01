package topic3;

public class Enum {//using Enum
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
