package pl.tlewandster.task8;

import java.util.List;

public class Main {

    static void main() {
        List<Flight> flights = List.of(
                new Flight("001", "2025-01-15", "10:00:00", "LCJ", "2025-01-15", "12:30:00", "WAW")
                );
        for (Flight flight : flights) {
            flight.calculateFlightDuration();
        }
    }
}


