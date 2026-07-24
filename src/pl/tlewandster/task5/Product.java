package pl.tlewandster.task5;

import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal price;

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public void showProduct() {
        System.out.printf("%s - price %.2f PLN %n", name, price);
    }
}
