package pl.tlewandster.task5;

import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = BigDecimal.valueOf(price);
    }

    public void showProduct() {
        System.out.printf("%s - price %.2f PLN %n", name, price);
    }

    public void reducePrice(Double amount) {
        BigDecimal oldPrice = price;
        price = price.subtract(BigDecimal.valueOf(amount));
        System.out.printf("The %s price has been reduced from %.2f PLN to %.2f PLN %n", name, oldPrice, price);
    }

    public void reducePrice(Double amount, String reason) {
        reducePrice(amount);
        System.out.printf("(The reason for the price reduction is %s) %n", reason);
    }
}
