package adapter.coffeemachine;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	public static void run() {
		
		FirstFloorCoffeeMachine firstCoffeeMachine = new FirstFloorCoffeeMachine();
		SecondFloorCoffeeMachine secondCoffeeMachine = new SecondFloorCoffeeMachine();
		
		List<CoffeeOperations> list = new ArrayList<>();
		list.add(firstCoffeeMachine);
		list.add(secondCoffeeMachine);
		
		TeaMachine teaMachine = new TeaMachine();
		TeaCoffeeAdapter teaCoffeeAdapter = new TeaCoffeeAdapter(teaMachine);
		
		list.add(teaCoffeeAdapter);	
		
		list.forEach(item -> item.serveCoffee());		
	}
}
