package Bridgelabz.HotelReservationSystem;
import org.junit.Assert;
import org.junit.Test;

public class AddNewHotelTest {
	@Test
	public void toAddHotelHotel_Should_returnTrue() {
		AddNewHotel hotelReservationSystem = new AddNewHotel();
		Hotel hotelCheck = new Hotel("Bridgewood", 160);
		Hotel hotelCheck1 = new Hotel("Lakewood", 110);
		Hotel hotelCheck2 = new Hotel("Ridgewood", 220);
	    boolean checkIfAdded =  hotelReservationSystem.addHotel(hotelCheck);
		Assert.assertEquals(checkIfAdded, true);
	}
	}

