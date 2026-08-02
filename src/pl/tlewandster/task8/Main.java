package pl.tlewandster.task8;

import java.time.Duration;
import java.util.List;

public class Main {

    static void main() {
        List<Flight> flights = List.of(
                new Flight("001 'The same zone'", "2025-01-15", "10:00:00", "LCJ", "2025-01-15", "12:30:00", "WAW")
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
                    .append("m\n")
                    .toString();
            System.out.println(summary);
        }
    }
}


