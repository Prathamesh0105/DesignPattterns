import java.util.*;
import java.util.ArrayList;
public class TravelFacade {
    private HotelBooker hotelBooker=new HotelBooker();   
    private FlightBooker flightBooker=new FlightBooker();   

    public void getFlightsAndHotels(Date from, Date to)  { 
        ArrayList<Flight> flights = flightBooker.getFlightsFor(from, to);
        System.out.println(" short listed flights\n"+flights) ;
        ArrayList<Hotel> hotels = hotelBooker.getHotelsFor(from, to);
        System.out.println(" short listed hotels\n"+hotels) ;

        //process and return   
    }
}
