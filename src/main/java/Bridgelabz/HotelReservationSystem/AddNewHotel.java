package Bridgelabz.HotelReservationSystem;

import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;

public class AddNewHotel {
	private final DateTimeFormatter DATE_RANGE_FORMAT = DateTimeFormatter.ofPattern("ddMMMyyyy");
	private ArrayList<Hotel> hotelInformation = new ArrayList<Hotel>();

	public boolean addHotel(Hotel newHotel) {
		System.out.println("");
		hotelInformation.add(newHotel);
		return true;
		
	}
	public Hotel findCheapestHotel(String startDateRange, String endDateRange) {
		LocalDate startDate = LocalDate.parse(startDateRange, DATE_RANGE_FORMAT);
		LocalDate endDate = LocalDate.parse(endDateRange, DATE_RANGE_FORMAT);
		int noOfDays= (int)ChronoUnit.DAYS.between(startDate, endDate);
		Hotel cheapestHotel = hotelInformation.stream()
				.sorted(Comparator.comparing(Hotel::getRegularCustomerRate))
				.findFirst()
				.orElse(null);
		int totalCostOfStay = (int) (noOfDays * cheapestHotel.getRegularCustomerRate());
		cheapestHotel.setTotalRate(totalCostOfStay);
 		System.out.println("the cheapest hotel among three is " + cheapestHotel);
		return cheapestHotel;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcom to Hotel Reservsation System");
	}
}

