package pl.tlewandster.task5;

public class Main {
    static void main() {
        // 1.First class and object
        Car car1 = new Car();
        car1.setBrand("Fiat 125p");
        car1.setYearOfProduction(1990);
        System.out.printf("Marka %s, rocznik %d",car1.getBrand(),car1.getYearOfProduction());
    }
}
