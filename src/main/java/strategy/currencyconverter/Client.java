package strategy.currencyconverter;

public class Client {
	
	public static void run() {
		
		CurrencyOperations euroConverter = new EuroConverter();
		CurrencyConverter currencyConverter = new CurrencyConverter(euroConverter);
		int euroAmount = currencyConverter.convertCurrency(100);
		System.out.println("The result of conversion :" + euroAmount + " euro");
		
		CurrencyOperations dollarConverter = new DollarConverter();
		currencyConverter.changeCurrency(dollarConverter);
		int dollarAmount = currencyConverter.convertCurrency(100);
		System.out.println("The result of conversion :" +dollarAmount + " dollar");
	}

}
