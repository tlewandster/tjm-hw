package pl.tlewandster.task6;

import static pl.tlewandster.task6.Utils.printSeparator;
import static pl.tlewandster.task6.Utils.printTitle;

@SuppressWarnings("JavaPrintToLogpoint")
public class Main {
    static void main() {
        printTitle("1. Prosty enum – dni tygodnia");
        DayOfWeek wednesday = DayOfWeek.WEDNESDAY;
        System.out.println(wednesday);
        printSeparator();

        printTitle("2. Enum i pętla");
        for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
            System.out.println(dayOfWeek);
        }
        printSeparator();

        printTitle("3. Porównywanie enum");
        DayOfWeek someDay1 = DayOfWeek.MONDAY;
        DayOfWeek someDay2 = DayOfWeek.MONDAY;
        System.out.println(someDay1 == someDay2);
        printSeparator();

        printTitle("4. Enum w switch");
        String partOfWeek = switch (wednesday) {
            case MONDAY, TUESDAY -> "The beginning of the week";
            case WEDNESDAY, THURSDAY -> "Midweek";
            case FRIDAY, SATURDAY, SUNDAY -> "Weekend";
        };
        System.out.println("Wednesday: " + partOfWeek);
        printSeparator();

        printTitle("5. Enum z metodą");
        System.out.println("Wednesday: " + wednesday.isWeekend());
        System.out.println("Sunday: " + DayOfWeek.SUNDAY.isWeekend());
        printSeparator();
    }
}
