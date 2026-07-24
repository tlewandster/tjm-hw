package pl.tlewandster.task5;

import java.math.BigDecimal;

import static pl.tlewandster.task5.Utils.printSeparator;
import static pl.tlewandster.task5.Utils.printTitle;

@SuppressWarnings("ALL")

public class Main {
    public static void main() {

        printTitle("1. First class and object");
        Car car1 = new Car();
        car1.setBrand("Fiat 125p");
        car1.setYearOfProduction(1990);
        car1.introduceYourself();
        printSeparator();

        printTitle("2. No-args constructor");
        Car car2 = new Car();
        car2.introduceYourself();
        printSeparator();

        printTitle("3. Constructor with parameters");
        Car car3 = new Car("Polonez", 1999);
        Car car4 = new Car("VW Golf", 2002);
        Car car5 = new Car("Skoda Favorit", 1992);
        car3.introduceYourself();
        car4.introduceYourself();
        car5.introduceYourself();
        printSeparator();

        printTitle("4. Fields vs local variables");
        car1.showDifference();
        car3.showDifference();
        car5.showDifference();
        printSeparator();

        printTitle("5. Using this in a method");
        car2.changeBrand("still unknown");
        car2.introduceYourself();
        printSeparator();

        printTitle("6. Calling one constructor from another");
        Car car6 = new Car();
        car6.introduceYourself();
        printSeparator();

        printTitle("7. Instance method");
        car2.introduceYourself();
        car4.introduceYourself();
        car6.introduceYourself();
        printSeparator();

        printTitle("8. Static method");
        Car.classDescription();
        printSeparator();

        printTitle("9. Static field");
        System.out.printf("%d cars created.%n", Car.getCount());
        printSeparator();

        printTitle("10. Array of objects");
        Car cars[] = {car1, car3, car5};
        for (Car car : cars) {
            car.introduceYourself();
        }
        printSeparator();

        printTitle("11. Simple class Person");
        Person person1 = new Person("Rychu", 60);
        Person person2 = new Person("Zdzichu", 65);
        Person person3 = new Person("Stachu", 40);
        person1.introduceYourself();
        person2.introduceYourself();
        person3.introduceYourself();
        printSeparator();

        printTitle("12. Method overloading – Person");
        person2.introduceYourself("Hi, everyone!");
        printSeparator();

        printTitle("13. Constructor overloading – Person");
        Person person4 = new Person("Joanna", 20);
        Person person5 = new Person("JoAntek");
        person4.introduceYourself();
        person5.introduceYourself();
        printSeparator();

        printTitle("15. Static vs non-static – difference");
        System.out.printf("%d persons created.%n", Person.getNumberOfPeople());
        printSeparator();

        printTitle("16. Array of people and method");
        Person persons[] = {person1, person2, person3, person4, person5};
        System.out.print("Aduld persons from array: ");
        for (Person person : persons) {
            if (person.isAdult()) System.out.printf("%s(%d) ", person.getName(), person.getAge());
        }
        System.out.println();
        printSeparator();

        printTitle("17. Method with object parameter");
        System.out.printf("The age difference between %s and %s is %d years. %n", person4.getName(), person5.getName(), person4.compareAge(person5));
        printSeparator();

        printTitle("18. Simple class Product");
        Product product1 = new Product("Coffee Beans", 15.99);
        Product product2 = new Product("Wireless Mouse", 29.50);
        Product product3 = new Product("Clean Code Book", 42.00);
        product1.showProduct();
        product2.showProduct();
        product3.showProduct();
        printSeparator();

        printTitle("19. Overloaded methods in Product");
        product1.reducePrice(5.00);
        product2.reducePrice(28.50, "being run over by a truck during a delivery...");
        printSeparator();

        printTitle("20. Simple Shop");
        Product[] groceryProducts = {
                new Product("Bread", 4.50),
                new Product("Milk 3.2%", 3.99),
                new Product("Eggs (10 pcs)", 12.50),
                new Product("Butter 200g", 7.99),
                new Product("Yellow cheese", 18.00)
        };
        Shop shop = new Shop("Ladybug", groceryProducts);
        shop.showProducts();
        printSeparator();
    }
}
