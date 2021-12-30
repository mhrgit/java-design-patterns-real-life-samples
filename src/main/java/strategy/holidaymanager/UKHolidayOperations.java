package strategy.holidaymanager;

public class UKHolidayOperations implements HolidayOperations {

	@Override
	public Holiday calculateHoliday() {
		return new Holiday(28, "UK");
	}
}
