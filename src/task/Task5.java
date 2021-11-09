	package task;



public class Task5 {

	enum Currency {
		INR("#","India"),USD("$","Usa"),EUR("@","Europe");
		
		String symbol,country;
		Currency(String country,String symbol) {
			this.country=country;
			this.symbol=symbol;
		}
		public static void checkcountry(String name) {
			for(Currency value1 : Currency.values()) {
				if(value1.country.contentEquals(name)) {
					System.out.println(value1);
				}
				else 
				{
				System.out.println("invalid symbol");
				}
			}
	
	public static void main (String[] args) {
		
		checkcountry("#");
		
	}
	}
	}
}