package topic3;

import java.util.Currency;
import java.util.Locale;

public class En1 {

	public static void main(String[] args) {
		System.out.println(
				  Currency.getInstance("USD").getSymbol(Locale.US)
				);
				

				System.out.println(
				  Currency.getInstance("USD").getSymbol(Locale.FRANCE)
				);
				

				System.out.println(
				  Currency.getInstance("EUR").getSymbol(Locale.US)
				);
				

				System.out.println(
				  Currency.getInstance("EUR").getSymbol(Locale.FRANCE)
				);

	}
	}

