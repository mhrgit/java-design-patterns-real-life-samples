package strategy.holidaymanager;

public class Client {
	
	public static void run() {
		
		USHolidayOperations usHolidayManager = new USHolidayOperations();
		HolidayManager holidayManager = new HolidayManager(usHolidayManager);
		holidayManager.getHoliday();
		
		UKHolidayOperations ukHolidayManager = new UKHolidayOperations();
		holidayManager.changeHolidayOperations(ukHolidayManager);
		holidayManager.getHoliday();
	}

}
