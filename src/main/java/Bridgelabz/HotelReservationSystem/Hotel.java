package Bridgelabz.HotelReservationSystem;

public class Hotel {
	private String hotelName;
	private int regularCustomerRate;
	private int totalRate;
	public Hotel(String hotelName, int regularCustomerRate) {
		this.hotelName = hotelName;
		this.regularCustomerRate = regularCustomerRate;
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
	public int getTotalRate() {
		return totalRate;
	}
	public void setTotalRate(int totalRate) {
		this.totalRate = totalRate;
	}
	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", regularCustomerRate=" + regularCustomerRate + ", totalRate="
				+ totalRate + "]";
	}
}