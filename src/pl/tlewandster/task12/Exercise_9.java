package pl.tlewandster.task12;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Exercise_9 {

    static void main() {
        Map<String, Integer> productToQty = new HashMap<>();
        productToQty.put("Bread", 2);
        productToQty.put("Milk", 3);
        productToQty.put("Coffee", 1);
        productToQty.put("Apples", 5);
        productToQty.put("Eggs", 10);

        BiConsumer<String, Integer> reporter = (String product, Integer qty) -> System.out.printf("Product: %s, Qty: %d%n", product, qty);
        printReport(productToQty, reporter);
    }

    static void printReport(Map<String, Integer> map, BiConsumer<String, Integer> consumer) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String product = entry.getKey();
            Integer qty = entry.getValue();
            consumer.accept(product,qty);
        }
    }
}

