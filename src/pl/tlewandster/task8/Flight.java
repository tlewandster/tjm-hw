package pl.tlewandster.task8;

import java.time.*;
import java.util.Map;

public class Flight {
    private String flightNumber;
    private String departureAirport;
    private String arrivalAirport;
    private ZonedDateTime departureTime;
    private ZonedDateTime arrivalTime;

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

    Flight(String flightNumber, String departureDate, String departureTime, String departureAirport, String arrivalDate, String arrivalTime, String arrivalAirport){
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = LocalDate.parse(departureDate).atTime(LocalTime.parse(departureTime)).atZone(IATA_TO_ZONE.get(this.departureAirport));
        this.arrivalTime = LocalDate.parse(arrivalDate).atTime(LocalTime.parse(arrivalTime)).atZone(IATA_TO_ZONE.get(this.arrivalAirport));
    }

//    public Duration calculateFlightDuration(){
//
//    }
}
