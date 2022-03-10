package Bridgelabz.HotelReservationSystem;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddNewHotelTest {

	AddNewHotel hotel = null;
	@Before
	public void initialization() {
		hotel = new AddNewHotel();
	}
//	@Test
//	public void givenHotelInfo_shouldAddHotelInList(){
//       boolean result = hotel.addHotel();
//       Assert.assertTrue(result);
//	}
	/*@Test
	public void givenHotelInfo_shouldReturnChepestHotel(){
		for(int i=0;i<3;i++)
			 hotel.addHotel();
       ArrayList<Hotel> arr= hotel.findCheapestHotel("10Sep2021", "11Sep2021");
       int expected = arr.get(0).getTotalRate();
       Assert.assertEquals(220, expected);
	}*/
	@Test
	public void givenHotelInfo_shouldReturnWeekdaysWeekendsRates() {
		for(int i=1;i<=3;i++)
			hotel.addHotel();
      ArrayList<Hotel> arr = hotel.findCheapestHotel("10Sep2021", "11Sep2021");
      String expected = arr.get(0).getHotelName();
      Assert.assertEquals("Lakewood", "Bridgewood" , expected);
		
	}
	 
	}

