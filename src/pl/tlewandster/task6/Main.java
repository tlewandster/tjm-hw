package pl.tlewandster.task6;

import java.util.List;
import java.util.Scanner;

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
            System.out.printf("%s has %d days %n", month.name(), month.getDays());
        }
        printSeparator();

        printTitle("7. Enum and the toString() method");
        System.out.println(Month.JULY);
        printSeparator();

        printTitle("8. Enum – sorting");
        System.out.printf("Results of the June-to-July comparison: %d %n", Month.JUNE.compareTo(Month.JULY));
        System.out.printf("Results of the July-to-July comparison: %d %n", Month.JULY.compareTo(Month.JULY));
        System.out.printf("Results of the July-to-June comparison: %d %n", Month.JULY.compareTo(Month.JUNE));
        printSeparator();

        printTitle("9. An enum with several fields");
        for (Month month : Month.values()) {
            System.out.println(month.name() + " isHolidaySeason: " + month.isHolidaySeason());
        }
        printSeparator();

        printTitle("10. Enum in a class – person and day off");
        Person jarek = new Person("Jarek", DayOfWeek.MONDAY);
        Person marek = new Person("Marek", DayOfWeek.WEDNESDAY);
        Person darek = new Person("Darek", DayOfWeek.FRIDAY);
        for (Person person : List.of(jarek, marek, darek)) {
            System.out.printf("%s has %s off %n", person.getName(), person.getDayOff());
        }
        printSeparator();

        printTitle("11. Enum in an array");
        Month[] months = Month.values();
        int sumOfDays = 0;
        for (Month month : months) {
            sumOfDays += month.getDays();
        }
        System.out.println("Number of days in a year: " + sumOfDays);
        printSeparator();

        printTitle("12. Enum – currency");
        for (Currency currency : Currency.values()) {
            System.out.printf("%s symbol -> %s %n", currency.name(), currency.getSymbol());
        }
        printSeparator();

        printTitle("13. Enum in the calculator");
        int a = 2;
        int b = 4;
        System.out.printf("%d - %d = %.2f %n", a, b, Operation.SUBTRACT.calculate(a, b));
        System.out.printf("%d + %d = %.2f %n", a, b, Operation.ADD.calculate(a, b));
        System.out.printf("%d x %d= %.2f %n", a, b, Operation.MULTIPLY.calculate(a, b));
        System.out.printf("%d / %d = %.2f %n", a, b, Operation.DIVIDE.calculate(a, b));
        printSeparator();

        printTitle("14. Enum – Order Status");
        for (OrderStatus orderStatus : OrderStatus.values()) {
            System.out.printf("%s - %b %n", orderStatus.name(), orderStatus.isActive());
        }
        printSeparator();

        printTitle("15. Enums and Overloaded Constructors"); // Why does the title refer to an overloaded constructor?
        for (Planet planet : Planet.values()) {
            System.out.printf("%s - %.2f kg/m3 %n", planet.name(), planet.getDensity());
        }
        printSeparator();

        printTitle("16. Enum as singleton");
        Logger.INSTANCE.log("test");
        printSeparator();

        printTitle("17. Enum and switch – menu");
        System.out.println("Menu:");
        for (MenuOption value : MenuOption.values()) {
            System.out.printf("%d - %s %n", value.ordinal(), value.name());
        }
        String action = "";
        while (action.isEmpty()) {
            System.out.println("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            action = switch (scanner.nextInt()) {
                case 0 -> MenuOption.values()[0].getAction();
                case 1 -> MenuOption.values()[1].getAction();
                case 2 -> MenuOption.values()[2].getAction();
                default -> "";
            };
        }
        System.out.printf("Ok, %s %n", action);
        printSeparator();

        printTitle("18. Enum and Object Array");
        Product[] products = {new Product("cabbage", Product.Category.FOOD), new Product("TV", Product.Category.ELECTRONICS), new Product("hat", Product.Category.CLOTHING)};
        for ( Product product : products){
            System.out.printf("%s - category %s %n", product.getName(), product.getCategory());
        }
        printSeparator();

        printTitle("19. Enum with an abstract method");
        System.out.printf("%d - %d = %.2f %n", a, b, Calculation.SUBTRACT.calculate(a, b));
        System.out.printf("%d + %d = %.2f %n", a, b, Calculation.ADD.calculate(a, b));
        System.out.printf("%d x %d= %.2f %n", a, b, Calculation.MULTIPLY.calculate(a, b));
        System.out.printf("%d / %d = %.2f %n", a, b, Calculation.DIVIDE.calculate(a, b));
        printSeparator();
    }
}

