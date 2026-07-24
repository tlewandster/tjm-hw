package pl.tlewandster.task5;

public class Car {
    private String brand;
    private int yearOfProduction;

    Car() {
        this("Unknown", 2000);
    }

    Car(String brand, int yearOfProduction) {
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void showDifference() {
        String brand = "local brand name";
        System.out.printf("this.brand = %s, local brand = %s %n", this.brand, brand);
    }

    public void changeBrand(String brand) {
        this.brand = brand;
    }

    public void introduceYourself() {
        System.out.printf("I am a car of brand %s, from year %d %n", this.getBrand(), this.getYearOfProduction());
    }
}
