package Bridgelabz.HotelReservationSystem;

public class Hotel {
	private String hotelName;
	private int regularCustomerRate;
	private int totalRate;
	private int weekDayRate;
	private int weekendRate;
	public Hotel(String hotelName, int weekDayRate,int weekendRate) {
		this.hotelName = hotelName;
         this.weekDayRate=weekDayRate;
        this.weekendRate=weekendRate;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getRegularCustomerRate() {
		return regularCustomerRate;
	}
	public void setRegularCustomerRate(int regularCustomerRate) {
		this.regularCustomerRate = regularCustomerRate;
	}
	public int getweekDayRate() {
		return getweekDayRate();
	}
	public void setWeekDayRate(int weekDayRates) {
		this.weekDayRate = weekDayRates;
	}
	public int getWeekendRates() {
		return weekendRate;
	}
	public void setWeekEndRates(int weekEndRates) {
		this.weekendRate = weekEndRates;
	}
	public int getTotalRate() {
		return totalRate;
	}
	public void setTotalRate(int totalRate) {
		this.totalRate = totalRate;
	}
	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", weekDayRate=" + weekDayRate + ", weeeEndRate="
				+ weekendRate + "]";
	}
}