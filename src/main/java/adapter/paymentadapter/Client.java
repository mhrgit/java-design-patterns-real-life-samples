package adapter.paymentadapter;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	public static void run() {
		
		CardPayment cardPayment = new CardPayment();
		CardPayment cardPayment2 = new CardPayment();
		CardPayment cardPayment3 = new CardPayment();
		
		List<Payment> list = new ArrayList<Payment>();
		list.add(cardPayment);
		list.add(cardPayment2);
		list.add(cardPayment3);
		
		CryptoPayment cryptoPayment = new CryptoPayment();
		CryptoPaymentAdapter adapter = new CryptoPaymentAdapter(cryptoPayment);
		list.add(adapter);
		
		list.forEach(item -> item.makePayment(200));		
	}
}
