import java.util.*;

public class FacadeDemo {
    public static void main(String[] args) {
        Date from=new Date();
        Date to=new Date();
        TravelFacade facade = new TravelFacade();
        System.out.println("From"+from+"To"+to);
        facade.getFlightsAndHotels(from, to); 
              
    }
}