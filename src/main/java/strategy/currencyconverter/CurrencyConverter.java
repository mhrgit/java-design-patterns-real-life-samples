package strategy.currencyconverter;

public class CurrencyConverter  {
	private CurrencyOperations currencyOperations;
	
	public CurrencyConverter(CurrencyOperations currencyOperations) {
		this.currencyOperations = currencyOperations;
	}
	
	public int convertCurrency(int amount) {
		return currencyOperations.convert(amount);
	}
	
	public void changeCurrency(CurrencyOperations currencyOperations) {
		this.currencyOperations = currencyOperations;
	}
}
