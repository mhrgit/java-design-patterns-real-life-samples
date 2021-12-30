package strategy.holidaymanager;

public class USHolidayOperations implements HolidayOperations {

	@Override
	public Holiday calculateHoliday() {
		return new Holiday(30, "US");
	}

}
