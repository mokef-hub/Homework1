import java.util.Date;
import java.util.UUID;

public class TravelManager {
    public static void main(String[] args) {
        Airport origAirport = new Airport("ORD");
        Airport destAirport = new Airport("SFO");
        Airline airline = new Airline("America");
        Flight flight = new Flight();
        flight.setAirline(airline);
        flight.setDestination(destAirport);
        flight.setFlightNumber(UUID.randomUUID().toString());
        flight.setOrigin(origAirport);
        flight.setDepartureTime(new Date());

        System.out.println(flight.toString());
        Flight flight2 = new Flight();
        try {
            flight2.setAirline(new Airline("American"));
        }catch (Exception ex){
            ex.printStackTrace();
        }
        try {
            flight2.setDestination(new Airport("ORDC"));
        }catch (Exception ex){
            ex.printStackTrace();
        }
        flight2.setFlightNumber(UUID.randomUUID().toString());
        flight2.setOrigin(origAirport);
        flight2.setDepartureTime(new Date());

        System.out.println(flight2.toString());
    }
}
