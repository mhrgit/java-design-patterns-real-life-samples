package strategy.payment;

public class VisaCard implements PaymentOperations {

	@Override
	public void pay(int amount) {
		System.out.println(amount + " has been paid by Visa Card");
	}
}
