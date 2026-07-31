package pl.tlewandster.task7;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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

//        printTitle("8. Average price");
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Number of products: ");
//        int numberOfProducts = scanner.nextInt();
//        scanner.nextLine();
//        BigDecimal sum = BigDecimal.ZERO;
//        for (int i = 0; i < numberOfProducts; i++) {
//            System.out.println("Price of product: ");
//            BigDecimal productPrice = new BigDecimal(scanner.nextLine());
//            sum = sum.add(productPrice);
//        }
//        BigDecimal avgPrice = sum.divide(new BigDecimal(numberOfProducts), 2, RoundingMode.HALF_UP);
//        System.out.printf("Average price: %s %n", avgPrice);
//        printSeparator();

        printTitle("9. Prices in different currencies");
        BigDecimal plnPrice = new BigDecimal(getRandomPriceString());
        BigDecimal exchangeRate = new BigDecimal("4.31");
        BigDecimal eurPrice = plnPrice.divide(exchangeRate, 2, RoundingMode.HALF_UP);
        System.out.printf("%s PLN -> %s EUR %n", plnPrice, eurPrice);
        printSeparator();

        printTitle("10. Precision difference – double vs BigDecimal");
        System.out.printf("double 0.1 + 0.2 = %f %n", 0.1 + 0.2);
        System.out.printf("BigDecimal 0.1 + 0.2 = %s %n", new BigDecimal("0.1").add(new BigDecimal("0.2")));
        printSeparator();

        printTitle("11. String – basic operations");
        String text = scanner.nextLine();
        String reversedText = new StringBuilder(text).reverse().toString();
        System.out.printf("Length: %d, uppercased: %s, lowercased: %s, reversed: %s %n", text.length(), text.toUpperCase(), text.toLowerCase(), reversedText);
        printSeparator();

        printTitle("12. String – searching");
        String sentence = "contains() returns true if and only if this string contains the specified sequence of char values.";
        String word = "and";
        boolean isContained = sentence.contains(word);
        int index = sentence.indexOf(word);
        System.out.println("sentence = " + sentence);
        System.out.println("word = " + word);
        System.out.println("isContained = " + isContained);
        System.out.println("index = " + index);
        printSeparator();

        printTitle("13. String – replacing fragments");
        sentence = "replace() Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.";
        System.out.println("Before: " + sentence);
        System.out.printf("After: %s %n", sentence.replace(" ", "_").replace(",", ""));
        printSeparator();

        printTitle("14. String – comparison");
        String string1 = "KajaK";
        String string2 = "kaJak";
        System.out.printf("%s vs %s %n", string1, string2);
        System.out.printf("equals() %b %n", string1.equals(string2));
        System.out.printf("equalsIgnoreCase() %b %n", string1.equalsIgnoreCase(string2));
        printSeparator();

        printTitle("15. String – splitting text");
        sentence = "Splits this string around matches of the given regular expression.";
        System.out.println(sentence);
        String[] splitedSentence = sentence.split(" ");
        for (String s : splitedSentence) {
            System.out.println(s);
        }
        printSeparator();

        printTitle("16. String – checking prefix and suffix");
        System.out.println("Enter sentence: ");
        sentence = scanner.nextLine();
        System.out.printf("Sentence%s starts with 'Java' and%s ends with '2025' %n",
                sentence.startsWith("Java") ? "" : " not",
                sentence.endsWith("2025") ? "" : " not");
        printSeparator();

        printTitle("17. Combining BigDecimal and String");
        String productName = "Milk";
        BigDecimal productPrice = new BigDecimal(getRandomPriceString());
        String summary = new StringBuilder()
                .append("Product: ")
                .append(productName.toUpperCase())
                .append(", price: ")
                .append(productPrice)
                .append(" PLN")
                .toString();
        System.out.println(summary);
        printSeparator();

        printTitle("18. Formatting prices");
        List<BigDecimal> somePrices = List.of(new BigDecimal(10), new BigDecimal(20), new BigDecimal(30));
        for (BigDecimal somePrice : somePrices) {
            System.out.println(somePrice.setScale(2,RoundingMode.HALF_UP) + " zł");
        }
        printSeparator();


    }
}

