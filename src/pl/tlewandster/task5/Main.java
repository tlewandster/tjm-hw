package pl.tlewandster.task5;

@SuppressWarnings("ALL")

public class Main {
    static void main() {

        insertTitle("1. First class and object");
        Car car1 = new Car();
        car1.setBrand("Fiat 125p");
        car1.setYearOfProduction(1990);
        System.out.printf("Marka %s, rocznik %d %n", car1.getBrand(), car1.getYearOfProduction());
        insertSeparator();

        insertTitle("2. No-args constructor");
        Car car2 = new Car();
        System.out.printf("Marka %s, rocznik %d %n", car2.getBrand(), car2.getYearOfProduction());
        insertSeparator();

        insertTitle("3. Constructor with parameters");
        Car car3 = new Car("Polonez", 1999);
        Car car4 = new Car("VW Golf", 2002);
        Car car5 = new Car("Skoda Favorit", 1992);
        System.out.printf("Marka %s, rocznik %d %n", car3.getBrand(), car3.getYearOfProduction());
        System.out.printf("Marka %s, rocznik %d %n", car4.getBrand(), car4.getYearOfProduction());
        System.out.printf("Marka %s, rocznik %d %n", car5.getBrand(), car5.getYearOfProduction());
        insertSeparator();

        insertTitle("4. Fields vs local variables");
        car1.showDifference();
        car3.showDifference();
        car5.showDifference();
        insertSeparator();
    }

    private static void insertTitle(String title) {
        final String SET_GREEN_FONT = "\u001B[32m";
        final String RESET_FONT_COLOR = "\u001B[0m";
        System.out.println(SET_GREEN_FONT + title + RESET_FONT_COLOR);
    }

    private static void insertSeparator() {
        System.out.println("-".repeat(50));
    }
}
