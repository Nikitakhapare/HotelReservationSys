package Bridgelabz.HotelReservationSystem;
import java.text.SimpleDateFormat;
import java.util.Date;
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
	 @Test
	    public void testForcheapestHotelWithinADateRange() {
	        AddNewHotel service = new AddNewHotel();
	        Hotel hotel1 = new Hotel("Lakewood", 220);
	        Hotel hotel2 = new Hotel("Bridgewood", 160);
	        Hotel hotel3 = new Hotel("Ridgewood", 220);
	        service.addHotel(hotel1);
	        service.addHotel(hotel2);
	        service.addHotel(hotel3);
	        Hotel hotel = service.findCheapestHotel("10Sep2020","11Sep2020");
            Assert.assertEquals("Lakewood", hotel.getHotelName());  
	    }
	}

