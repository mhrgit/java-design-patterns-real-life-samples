package adapter.paymentadapter;

public class CardPayment implements Payment {

	@Override
	public void makePayment(int amount) {
		System.out.println(amount + " amount has been paid by card");
	}
}
