package strategy.restaurant;

public class Client {
	
	public static void run() {
		RestaurantOperations pizzaRestaurant = new PizzaRestaurant();
		RestaurantOperations italianRestaurant = new ItalianRestaurant();
		RestaurantRunner restaurantRunner = new RestaurantRunner(pizzaRestaurant);
		restaurantRunner.cookYourFood();
		
		restaurantRunner.changeRestaurant(italianRestaurant);
		restaurantRunner.cookYourFood();
	}
}
