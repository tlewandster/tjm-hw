package pl.tlewandster.task8;

import java.time.*;
import java.util.Map;

public class Flight {
    private static final Map<String, ZoneId> IATA_TO_ZONE = Map.of(
            "WAW", ZoneId.of("Europe/Warsaw"),
            "LCJ", ZoneId.of("Europe/Warsaw"),
            "JFK", ZoneId.of("America/New_York"),
            "HND", ZoneId.of("Asia/Tokyo"),
            "LAX", ZoneId.of("America/Los_Angeles"),
            "CCU", ZoneId.of("Asia/Kolkata"),
            "SIN", ZoneId.of("Asia/Singapore"),
            "LHR", ZoneId.of("Europe/London")
    );
    private final String flightNumber;
    private final String departureAirport;
    private final String arrivalAirport;
    private final ZonedDateTime departureTime;
    private final ZonedDateTime arrivalTime;

    Flight(String flightNumber, String departureDate, String departureTime, String departureAirport, String arrivalDate, String arrivalTime, String arrivalAirport) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        validateAirportZone(this.departureAirport);
        validateAirportZone((this.arrivalAirport));
        this.departureTime = LocalDate.parse(departureDate).atTime(LocalTime.parse(departureTime)).atZone(IATA_TO_ZONE.get(this.departureAirport));
        this.arrivalTime = LocalDate.parse(arrivalDate).atTime(LocalTime.parse(arrivalTime)).atZone(IATA_TO_ZONE.get(this.arrivalAirport));
        validateArrivalAndDepartureTime(this.departureTime, this.arrivalTime);
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Duration calculateFlightDuration() {
        Instant departureInstant = departureTime.toInstant();
        Instant arrivalInstant = arrivalTime.toInstant();
        return Duration.between(departureInstant, arrivalInstant);
    }

    void validateAirportZone(String airport) {
        if (!IATA_TO_ZONE.containsKey(airport)) {
            throw new DateTimeException("Unknown time zone for departure airport: " + airport);
        }
    }

    void validateArrivalAndDepartureTime(ZonedDateTime departureTime, ZonedDateTime arrivalTime) {
        if (arrivalTime.toInstant().isBefore(departureTime.toInstant())) {
            throw new IllegalArgumentException("Arrival time must be after departure time.");
        }
    }
}
