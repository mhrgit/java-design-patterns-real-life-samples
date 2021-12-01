package strategy.currencyconverter;

public class GbpConverter implements CurrencyOperations {

	public int convert(int amount) {
		return amount * 4;
	}
}
