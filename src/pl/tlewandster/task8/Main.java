package pl.tlewandster.task8;

import java.time.Duration;
import java.util.List;

public class Main {

    static void main() {
        List<Flight> flights = List.of(
                new Flight("001 'The same zone'", "2025-01-15", "10:00:00", "LCJ", "2025-01-15", "12:30:00", "WAW"),
                new Flight("002 'On another day (same zone)'", "2025-01-15", "23:00:00", "LCJ", "2025-01-16", "01:30:00", "WAW"),
                new Flight("003 'Intercontinental (WAW → NYC)'", "2025-01-15", "10:00:00", "WAW", "2025-01-15", "14:00:00", "JFK"),
                new Flight("004 'Switch to daylight saving time (spring-forward)'", "2025-03-30", "01:00:00", "LCJ", "2025-03-30", "05:00:00", "WAW"),
                new Flight("005 'Switch to standard time (fall-back)'", "2025-10-26", "01:00:00", "LCJ", "2025-10-26", "02:30:00", "WAW"),
                new Flight("006 'Date Change Line (Tokyo → LA)'", "2025-01-15", "10:00:00", "HND", "2025-01-14", "18:00:00", "LAX"),
                new Flight("007 'Incorrect time zone'", "2025-01-15", "10:00:00", "HND", "2025-01-14", "18:00:00", "LAX"),
                new Flight("008 'Arrival before departure (same zone)'", "2025-01-15", "10:00:00", "LCJ", "2025-01-15", "08:00:00", "WAW"), //TODO walidacja
                new Flight("009 'No DST at the destination (WAW → Kolkata)'", "2025-01-15", "10:00:00", "WAW", "2025-01-15", "19:00:00", "CCU"),
                new Flight("010 'Long flight (WAW → Singapore)'", "2025-01-15", "06:00:00", "WAW", "2025-01-16", "06:00:00", "SIN"),
                new Flight("011 'Round trip on the same day (WAW ↔ LON, winter)'", "2025-01-15", "08:00:00", "WAW", "2025-01-15", "12:00:00", "LHR"),
                new Flight("011 'Round trip on the same day (LON ↔ WAW, winter)'", "2025-01-15", "16:00:00", "LHR", "2025-01-15", "20:00:00", "WAW")
        );
        for (Flight flight : flights) {
            Duration flightDuration = flight.calculateFlightDuration();
            String summary = new StringBuilder()
                    .append("Flight No.")
                    .append(flight.getFlightNumber())
                    .append(" - duration: ")
                    .append(flightDuration.toHoursPart())
                    .append("h ")
                    .append(flightDuration.toMinutesPart())
                    .append("m")
                    .toString();
            System.out.println(summary);
        }
    }
}


