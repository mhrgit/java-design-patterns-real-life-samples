package strategy.payment;

public class PayPal implements PaymentOperations {

	@Override
	public void pay(int amount) {
		System.out.println(amount + " has been paid by PayPal");
	}
}
