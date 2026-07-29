package pl.tlewandster.task6;

import static pl.tlewandster.task6.Utils.printSeparator;
import static pl.tlewandster.task6.Utils.printTitle;

@SuppressWarnings("JavaPrintToLogpoint")
public class Main {
    static void main() {
        printTitle("1. A Simple Enum – Days of the Week");
        DayOfWeek wednesday = DayOfWeek.WEDNESDAY;
        System.out.println(wednesday);
        printSeparator();

        printTitle("2. Enum and Loop");
        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            System.out.println(dayOfWeek);
        }
        printSeparator();

        printTitle("3. Comparing Enums");
        DayOfWeek someDay1 = DayOfWeek.MONDAY;
        DayOfWeek someDay2 = DayOfWeek.MONDAY;
        System.out.println(someDay1 == someDay2);
        printSeparator();

        printTitle("4. Enum in a switch statement");
        String partOfWeek = switch (wednesday) {
            case MONDAY, TUESDAY -> "The beginning of the week";
            case WEDNESDAY, THURSDAY -> "Midweek";
            case FRIDAY, SATURDAY, SUNDAY -> "Weekend";
        };
        System.out.println("Wednesday: " + partOfWeek);
        printSeparator();

        printTitle("5. Enum with a method");
        System.out.println("Wednesday: " + wednesday.isWeekend());
        System.out.println("Sunday: " + DayOfWeek.SUNDAY.isWeekend());
        printSeparator();

        printTitle("6. Enum with a field and a constructor");
        for (Month month : Month.values()) {
            System.out.printf("%s has %d days %n", month.name(),month.getDays());
        }
        printSeparator();

        printTitle("7. Enum and the toString() method");
        System.out.println(Month.JULY);
        printSeparator();
    }
}
