package pl.tlewandster.task8;

import java.time.Duration;
import java.util.List;

public class Main {

    static void main() {
        List<String[]> flightsToCreate = List.of(
                new String[]{"001 'The same zone'", "2025-01-15", "10:00:00", "LCJ", "2025-01-15", "12:30:00", "WAW"},
                new String[]{"002 'On another day (same zone)'", "2025-01-15", "23:00:00", "LCJ", "2025-01-16", "01:30:00", "WAW"},
                new String[]{"003 'Intercontinental (WAW → NYC)'", "2025-01-15", "10:00:00", "WAW", "2025-01-15", "14:00:00", "JFK"},
                new String[]{"004 'Switch to daylight saving time (spring-forward)'", "2025-03-30", "01:00:00", "LCJ", "2025-03-30", "05:00:00", "WAW"},
                new String[]{"005 'Switch to standard time (fall-back)'", "2025-10-26", "01:00:00", "LCJ", "2025-10-26", "02:30:00", "WAW"},
                new String[]{"006 'Date Change Line (Tokyo → LA)'", "2025-01-15", "10:00:00", "HND", "2025-01-14", "18:00:00", "LAX"},
                new String[]{"007 'Incorrect time zone'", "2025-01-15", "10:00:00", "XXX", "2025-01-14", "18:00:00", "LAX"},
                new String[]{"008 'Arrival before departure (same zone)'", "2025-01-15", "10:00:00", "LCJ", "2025-01-15", "08:00:00", "WAW"},
                new String[]{"009 'No DST at the destination (WAW → Kolkata)'", "2025-01-15", "10:00:00", "WAW", "2025-01-15", "19:00:00", "CCU"},
                new String[]{"010 'Long flight (WAW → Singapore)'", "2025-01-15", "06:00:00", "WAW", "2025-01-16", "06:00:00", "SIN"},
                new String[]{"011 'Round trip on the same day (WAW ↔ LON, winter)'", "2025-01-15", "08:00:00", "WAW", "2025-01-15", "12:00:00", "LHR"},
                new String[]{"011 'Round trip on the same day (LON ↔ WAW, winter)'", "2025-01-15", "16:00:00", "LHR", "2025-01-15", "20:00:00", "WAW"}
        );
        for (String[] f : flightsToCreate) {
            try {
                Flight flight = new Flight(f[0], f[1], f[2], f[3], f[4], f[5], f[6]);
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
            } catch (Exception e) {
                System.out.println("Flight No." + f[0] + " - " + "\u001B[31m" + e.getMessage() + "\u001B[0m");
            }
        }
    }
}


