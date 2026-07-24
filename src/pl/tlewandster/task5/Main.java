package pl.tlewandster.task5;

import static pl.tlewandster.task5.Utils.*;

@SuppressWarnings("ALL")

public class Main {
    public static void main() {

        printTitle("1. First class and object");
        Car car1 = new Car();
        car1.setBrand("Fiat 125p");
        car1.setYearOfProduction(1990);
        System.out.printf("Marka %s, rocznik %d %n", car1.getBrand(), car1.getYearOfProduction());
        printSeparator();

        printTitle("2. No-args constructor");
        Car car2 = new Car();
        System.out.printf("Marka %s, rocznik %d %n", car2.getBrand(), car2.getYearOfProduction());
        printSeparator();

        printTitle("3. Constructor with parameters");
        Car car3 = new Car("Polonez", 1999);
        Car car4 = new Car("VW Golf", 2002);
        Car car5 = new Car("Skoda Favorit", 1992);
        System.out.printf("Marka %s, rocznik %d %n", car3.getBrand(), car3.getYearOfProduction());
        System.out.printf("Marka %s, rocznik %d %n", car4.getBrand(), car4.getYearOfProduction());
        System.out.printf("Marka %s, rocznik %d %n", car5.getBrand(), car5.getYearOfProduction());
        printSeparator();

        printTitle("4. Fields vs local variables");
        car1.showDifference();
        car3.showDifference();
        car5.showDifference();
        printSeparator();

        printTitle("5. Using this in a method");
        car2.changeBrand("still unknown");
        System.out.printf("Marka %s, rocznik %d %n", car2.getBrand(), car2.getYearOfProduction());
        printSeparator();
    }
}
