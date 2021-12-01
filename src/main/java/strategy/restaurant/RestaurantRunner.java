package strategy.restaurant;

public class RestaurantRunner {
	private RestaurantOperations restaurant;
	
	public RestaurantRunner(RestaurantOperations restaurant) {
		this.restaurant = restaurant;
	}

	public void cookYourFood() {
		restaurant.cook();
	}
	
	public void changeRestaurant(RestaurantOperations restaurant) {
		this.restaurant = restaurant;
	}
}
