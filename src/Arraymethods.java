
public class Arraymethods {

	public static void main(String[] args) {
		int[] marks = {25,20,30,28,18,12,29,14,9,17};
		int sum = 0;
		double average;
		for(int mark:marks) {
			sum+=mark;
		}
		int arrayLength = marks.length;
		average = (sum/arrayLength);
		System.out.println("sum=" + sum);
		System.out.println("Average=" + average);
		
				
		}

	}

