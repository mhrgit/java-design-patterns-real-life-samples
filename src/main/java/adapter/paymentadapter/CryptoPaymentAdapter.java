package adapter.paymentadapter;

public class CryptoPaymentAdapter implements Payment {
	
	private CryptoPayment CryptoPayment;
	
	public CryptoPaymentAdapter(CryptoPayment cryptoPayment) {
		this.CryptoPayment = cryptoPayment;
	}

	@Override
	public void makePayment(int amount) {
		CryptoPayment.payCrypto(amount);
	}
}
