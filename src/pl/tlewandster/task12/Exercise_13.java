package pl.tlewandster.task12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercise_13 {
    record Product(String name, double price, int rating) {
    }

    static void main() {
        List<Product> products = new ArrayList<>(List.of(
                new Product("Wireless Headphones", 89.99, 5),
                new Product("Smart Watch", 199.50, 4),
                new Product("Mechanical Keyboard", 124.95, 5),
                new Product("Gaming Mouse", 45.00, 3),
                new Product("Laptop Stand", 29.99, 4)
        ));
        Comparator<Product> compareByPrice = Comparator.comparingDouble(Product::price).thenComparing(Comparator.comparingInt(Product::rating)).reversed();
        products.sort(compareByPrice);
        System.out.println(products);
    }

}



