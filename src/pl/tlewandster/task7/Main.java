package pl.tlewandster.task7;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

import static pl.tlewandster.task7.Utils.*;

@SuppressWarnings("JavaPrintToLogpoint")
public class Main {
    static void main() {
        printTitle("1. Simple use of BigDecimal");
        BigDecimal value1 = new BigDecimal("10.50");
        System.out.println(value1);
        BigDecimal value2 = new BigDecimal("2.25");
        System.out.println(value2);
        System.out.println("Sum " + value1.add(value2));
        System.out.println("Difference " + value1.subtract(value2));
        System.out.println("Product " + value1.multiply(value2));
        System.out.println("Quotient " + value1.divide(value2, RoundingMode.HALF_UP));
        printSeparator();

        printTitle("2. BigDecimal from String");
        BigDecimal bigDecimal = new BigDecimal("3.333");
        BigDecimal bigDecimal1 = new BigDecimal(3.333);
        System.out.printf("%s vs %s %n", bigDecimal, bigDecimal1);
        printSeparator();

        printTitle("3. Rounding prices");
        BigDecimal price = new BigDecimal("10.56789");
        price = price.setScale(2, RoundingMode.HALF_UP);
        System.out.println(price);
        printSeparator();

        printTitle("4. Calculating discount");
        BigDecimal price1 = new BigDecimal(getRandomPriceString());
        BigDecimal discount = new BigDecimal("0.15");
        BigDecimal discountedPrice = price1.subtract(price1.multiply(discount).setScale(2, RoundingMode.HALF_UP));
        System.out.println("Price " + price1 + " after 15% discount: " + discountedPrice);
        printSeparator();

        printTitle("5. VAT tax");
        BigDecimal netPrice = new BigDecimal(getRandomPriceString());
        BigDecimal grossPrice = netPrice.multiply(new BigDecimal("1.23")).setScale(2, RoundingMode.HALF_UP);
        System.out.println(netPrice + " + 23% VAT = " + grossPrice);
        printSeparator();

        printTitle("6. Comparing prices");
        BigDecimal price2 = new BigDecimal(getRandomPriceString());
        BigDecimal price3 = new BigDecimal(getRandomPriceString());
        int compared = price2.compareTo(price3);
        System.out.printf("%s is %sgreater then %s %n", price2, compared > 0 ? "" : "not ", price3);

        printTitle("7. Shopping cart sum");
        BigDecimal[] prices = new BigDecimal[10];
        for (int i = 0; i < prices.length; i++) {
            prices[i] = new BigDecimal(getRandomPriceString());
        }
        System.out.printf("Cart: %s %n", Arrays.toString(prices));
        BigDecimal sumOfCart = BigDecimal.ZERO;
        for (BigDecimal p : prices) {
            sumOfCart = sumOfCart.add(p);
        }
        System.out.printf("Sum of cart: %s %n", sumOfCart);
        printSeparator();

    }
}

