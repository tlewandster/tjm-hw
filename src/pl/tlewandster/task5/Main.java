package pl.tlewandster.task5;

@SuppressWarnings("ALL")

public class Main {
    private static final String SET_GREEN_FONT = "\u001B[32m";
    private static final String RESET_FONT_COLOR = "\u001B[0m";

    static void main() {
        System.out.println(SET_GREEN_FONT + "1. First class and object" + RESET_FONT_COLOR);
        Car car1 = new Car();
        car1.setBrand("Fiat 125p");
        car1.setYearOfProduction(1990);
        System.out.printf("Marka %s, rocznik %d %n", car1.getBrand(), car1.getYearOfProduction());
        System.out.println();

        System.out.println(SET_GREEN_FONT + "2.No-args constructor" + RESET_FONT_COLOR);
        Car car2 = new Car();
        System.out.printf("Marka %s, rocznik %d %n", car2.getBrand(), car2.getYearOfProduction());
        System.out.println();

        System.out.println(SET_GREEN_FONT + "3.Constructor with parameters" + RESET_FONT_COLOR);
        Car car3 = new Car("Polonez", 1999);
        Car car4 = new Car("VW Golf", 2002);
        Car car5 = new Car("Skoda Favorit", 1992);
        System.out.printf("Marka %s, rocznik %d %n", car3.getBrand(), car3.getYearOfProduction());
        System.out.printf("Marka %s, rocznik %d %n", car4.getBrand(), car4.getYearOfProduction());
        System.out.printf("Marka %s, rocznik %d %n", car5.getBrand(), car5.getYearOfProduction());
        System.out.println();

        System.out.println(SET_GREEN_FONT + "4.Fields vs local variables" + RESET_FONT_COLOR);
        car1.showDifference();
        car3.showDifference();
        car5.showDifference();
        System.out.println();
    }
}
