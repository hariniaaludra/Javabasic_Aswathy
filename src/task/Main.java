package task;

class Enumtask {
	enum Currency {
		INR("#", "India"), USD("$", "Usa"), EUR("@", "Europe");

		String symbol, country;

		Currency(String country, String symbol) {
			this.country = country;
			this.symbol = symbol;
		}

		public static void checkcountry(String name) {
			for (Currency value : Currency.values()) {
				if (value.country.contentEquals(name)) {
					System.out.println(value);
				} else {
					System.out.println("invalid symbol");
				}
			}
		}

	}
}

public class Main {

	public static void main(String[] args) {
		// Enumtask.Currency.checkcountry("#");
		Enumtask.Currency.checkcountry("$");
		// Enumtask.Currency.checkcountry("%");

	}

}
