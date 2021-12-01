package entry;

public class Runner {
	public static void main(String[] args) {
		strategy.restaurant.Client.run();
		strategy.transportation.Client.run();
		strategy.currencyconverter.Client.run();
		adapter.plugadapter.Client.run();
	}
}
