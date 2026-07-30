package pl.tlewandster.task7;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static pl.tlewandster.task7.Utils.printSeparator;
import static pl.tlewandster.task7.Utils.printTitle;

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
        System.out.printf("%s vs %s %n", bigDecimal,bigDecimal1);
        printSeparator();

        printTitle("3. Rounding prices");
        BigDecimal price = new BigDecimal("10.56789");
        price = price.setScale(2,RoundingMode.HALF_UP);
        System.out.println(price);
        printSeparator();

        printTitle("4. Calculating discount");
        BigDecimal price1 = new BigDecimal("13.99");
        BigDecimal discountPercent = new BigDecimal("15");
        BigDecimal discountedPrice = price1.multiply(discountPercent.divide(new BigDecimal(100)));
        System.out.println("Price after 15% discount: " + discountedPrice.setScale(2,RoundingMode.HALF_UP));
        printSeparator();
    }
}

