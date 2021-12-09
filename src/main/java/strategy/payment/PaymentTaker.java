package strategy.payment;

public class PaymentTaker {
	private PaymentOperations paymentType;
	
	public PaymentTaker(PaymentOperations paymentType) {
		this.paymentType = paymentType;
	}

	public void makePayment(int amount) {
		this.paymentType.pay(amount);
	}
	
	public void changePaymentType(PaymentOperations paymentType) {
		this.paymentType = paymentType;
	}
}
