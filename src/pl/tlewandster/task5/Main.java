package pl.tlewandster.task5;

public class Main {
    static void main() {
        // 1.First class and object
        Car car1 = new Car();
        car1.setBrand("Fiat 125p");
        car1.setYearOfProduction(1990);
        System.out.printf("Marka %s, rocznik %d %n",car1.getBrand(),car1.getYearOfProduction());

        // 2.No-args constructor
        Car car2 = new Car();
        System.out.printf("Marka %s, rocznik %d %n",car2.getBrand(),car2.getYearOfProduction());
    }
}
