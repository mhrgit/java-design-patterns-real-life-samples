package strategy.payment;

public class Client {
	
	public static void run() {
		
		PaymentOperations visaPayment = new VisaCard();
		
		PaymentTaker paymentTaker = new PaymentTaker(visaPayment);
		paymentTaker.makePayment(100);
		
		PaymentOperations paypalPayment = new PayPal();
		
		paymentTaker.changePaymentType(paypalPayment);
		paymentTaker.makePayment(200);
	}

}
