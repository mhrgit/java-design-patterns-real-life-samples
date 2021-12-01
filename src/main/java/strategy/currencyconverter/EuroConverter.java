package strategy.currencyconverter;

public class EuroConverter implements CurrencyOperations {

	public int convert(int amount) {
		return amount * 3;
	}
}
