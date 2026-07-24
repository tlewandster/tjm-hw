package pl.tlewandster.task5;

import static pl.tlewandster.task5.Utils.*;

@SuppressWarnings("ALL")

public class Main {
    public static void main() {

        printTitle("1. First class and object");
        Car car1 = new Car();
        car1.setBrand("Fiat 125p");
        car1.setYearOfProduction(1990);
        car1.printCarInfo();
        printSeparator();

        printTitle("2. No-args constructor");
        Car car2 = new Car();
        car2.printCarInfo();
        printSeparator();

        printTitle("3. Constructor with parameters");
        Car car3 = new Car("Polonez", 1999);
        Car car4 = new Car("VW Golf", 2002);
        Car car5 = new Car("Skoda Favorit", 1992);
        car3.printCarInfo();
        car4.printCarInfo();
        car5.printCarInfo();
        printSeparator();

        printTitle("4. Fields vs local variables");
        car1.showDifference();
        car3.showDifference();
        car5.showDifference();
        printSeparator();

        printTitle("5. Using this in a method");
        car2.changeBrand("still unknown");
        car2.printCarInfo();
        printSeparator();

        printTitle("6. Calling one constructor from another");
        Car car6 = new Car();
        car6.printCarInfo();
        printSeparator();
    }
}
