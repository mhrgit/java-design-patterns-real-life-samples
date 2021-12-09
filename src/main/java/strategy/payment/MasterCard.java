package strategy.payment;

public class MasterCard implements PaymentOperations {

	@Override
	public void pay(int amount) {
		System.out.println(amount + " has been pad by Master Card");
	}
}
