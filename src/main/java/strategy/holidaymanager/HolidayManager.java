package strategy.holidaymanager;

public class HolidayManager {

	private HolidayOperations holidayOperations;
	
	public HolidayManager(HolidayOperations holidayOperations) {
		this.holidayOperations = holidayOperations;
	}
	
	public void getHoliday() {
		Holiday holiday = holidayOperations.calculateHoliday();
		System.out.println("Total holiday for " + holiday.country + " is " + holiday.numberOfHoliday);
	}
	
	public void changeHolidayOperations(HolidayOperations holidayOperations) {
		this.holidayOperations = holidayOperations;
	}
}
