package Bridgelabz.HotelReservationSystem;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;

public class AddNewHotelTest {
	@Test
	public void toAddHotelHotel_Should_returnTrue() {
		AddNewHotel hotelReservationSystem = new AddNewHotel();
		Hotel hotelCheck = new Hotel("Bridgewood", 150,90);
		Hotel hotelCheck1 = new Hotel("Lakewood", 110,67);
		Hotel hotelCheck2 = new Hotel("Ridgewood", 220,99);
	    boolean checkIfAdded =  hotelReservationSystem.addHotel("Bridgewood", 150,90);
		Assert.assertEquals(checkIfAdded, true);
	}
	 @Test
	    public void testForcheapestHotelWithinADateRange() {
	        AddNewHotel service = new AddNewHotel();
	        service.addHotel("Lakewood", 220,67);
	        service.addHotel("Bridgewood", 160,98);
	        service.addHotel("Ridgewood", 220,90);
	        Hotel hotel = service.findCheapestHotel("10Sep2020","11Sep2020");
            Assert.assertEquals("Bridgewood", hotel.getHotelName());  
	    
		}
	 
	}

