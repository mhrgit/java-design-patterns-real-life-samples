package strategy.currencyconverter;

public class DollarConverter implements CurrencyOperations {

	public int convert(int amount) {
		return amount * 2;
	}

}
