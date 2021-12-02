package adapter.coffeemachine;

public class TeaCoffeeAdapter implements CoffeeOperations {

	private TeaMachine teaMachine;
	
	public TeaCoffeeAdapter(TeaMachine teaMachine) {
		this.teaMachine = teaMachine;
	}
	
	@Override
	public void serveCoffee() {
		System.out.println("Adapter is on operation...");
		teaMachine.serveTea();
	}

}
