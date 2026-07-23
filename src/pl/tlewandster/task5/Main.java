package pl.tlewandster.task5;

public class Main {
    static void main() {
        // 1.First class and object
        Car car1 = new Car();
        car1.setBrand("Fiat 125p");
        car1.setYearOfProduction(1990);
        System.out.printf("Marka %s, rocznik %d %n", car1.getBrand(), car1.getYearOfProduction());

        // 2.No-args constructor
        Car car2 = new Car();
        System.out.printf("Marka %s, rocznik %d %n", car2.getBrand(), car2.getYearOfProduction());

        // 3.Constructor with parameters
        Car car3 = new Car("Polonez", 1999);
        Car car4 = new Car("VW Golf", 2002);
        Car car5 = new Car("Skoda Favorit", 1992);
        System.out.printf("Marka %s, rocznik %d %n", car3.getBrand(), car3.getYearOfProduction());
        System.out.printf("Marka %s, rocznik %d %n", car4.getBrand(), car4.getYearOfProduction());
        System.out.printf("Marka %s, rocznik %d %n", car5.getBrand(), car5.getYearOfProduction());
    }
}
