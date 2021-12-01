package task;

class Enumtask {
	enum Currency {
		INR("#", "India"), USD("$", "Usa"), EUR("@", "Europe");

		String symbol, country;

		Currency(String country, String symbol) {
			this.country = country;
			this.symbol = symbol;
		}

		public static Currency checkcountry(String name) {
			for (Currency value : Currency.values()) {
				if (value.country.contentEquals(name)) {
					System.out.println(value);
			}
		}
			return null;

	}
}

public class Main {

	public void main(String[] args) {
		Enumtask.Currency.checkcountry("#");
		Enumtask.Currency.checkcountry("$");
		Enumtask.Currency.checkcountry("%");

	}

}
}