package strategy.transportation;

public class TransportationRunner {
	private TransportationOperations transportation;
	
	public TransportationRunner(TransportationOperations transportation) {
		this.transportation = transportation;
	}
	
	public void transport() {
		transportation.transport();
	}
	
	public void changeTransportation(TransportationOperations transportation) {
		this.transportation = transportation;
	}
}
