package adapter.coffeemachine;

public class FirstFloorCoffeeMachine implements CoffeeOperations {

	@Override
	public void serveCoffee() {
		System.out.println("Coffe has been served to you in the first floor.");		
	}
}
