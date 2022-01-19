import java.util.Date;
import java.util.Objects;

public class Flight {

    private Airline airline;
    private Airport Origin;
    private Airport Destination;
    private String FlightNumber;
    private Date departureTime;

    public Flight() {
    }

    public Flight(Airline airline, Airport origin, Airport destination, String flightNumber, Date departureTime) {
        this.airline = airline;
        Origin = origin;
        Destination = destination;
        FlightNumber = flightNumber;
        this.departureTime = departureTime;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public Airport getOrigin() {
        return Origin;
    }

    public void setOrigin(Airport origin) {
        Origin = origin;
    }

    public Airport getDestination() {
        return Destination;
    }

    public void setDestination(Airport destination) {
        Destination = destination;
    }

    public String getFlightNumber() {
        return FlightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        FlightNumber = flightNumber;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(airline, flight.airline) && Objects.equals(Origin, flight.Origin) && Objects.equals(Destination, flight.Destination) && Objects.equals(FlightNumber, flight.FlightNumber) && Objects.equals(departureTime, flight.departureTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airline, Origin, Destination, FlightNumber, departureTime);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "airline=" + airline +
                ", Origin=" + Origin +
                ", Destination=" + Destination +
                ", FlightNumber='" + FlightNumber + '\'' +
                ", departureTime=" + departureTime +
                '}';
    }
}
