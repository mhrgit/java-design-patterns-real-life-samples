package adapter.coffeemachine;

public class SecondFloorCoffeeMachine implements CoffeeOperations {

	@Override
	public void serveCoffee() {
		System.out.println("Coffee has been served to you in the second floor.");
	}

}
