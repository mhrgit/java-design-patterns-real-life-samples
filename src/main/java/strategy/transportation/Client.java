package strategy.transportation;

public class Client {
	public static void run() {
		
		TransportationOperations bus = new Bus();
		TransportationOperations train = new Train();
		TransportationRunner tranportation = new TransportationRunner(bus);
		tranportation.transport
		
		();
		
		tranportation.changeTransportation(train);
		tranportation.transport();		
	}
}
