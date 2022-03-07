package Bridgelabz.HotelReservationSystem;

import java.util.ArrayList;

public class AddNewHotel {

	private ArrayList<Hotel> hotelList = new ArrayList<Hotel>();

	public boolean addHotel(Hotel newHotel) {
		hotelList.add(newHotel);
		return true;
	}
	
}

