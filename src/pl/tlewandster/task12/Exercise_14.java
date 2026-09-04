package pl.tlewandster.task12;

public class Exercise_14 {
    final static double DISCOUNT_10_PERCENT = 0.9;
    final static double DISCOUNT_20_PERCENT = 0.8;
    final static double DISCOUNT_30_PERCENT = 0.7;

    static void main() {

        PriceStrategy normal = basePrice -> basePrice;
        PriceStrategy student = basePrice -> basePrice * DISCOUNT_10_PERCENT;
        PriceStrategy vip = basePrice -> basePrice * DISCOUNT_20_PERCENT;
        PriceStrategy blackFriday = basePrice -> basePrice * DISCOUNT_30_PERCENT;

        double[] basePrices = {100, 250, 399};

        for (double basePrice : basePrices) {
            System.out.println("For base price " + basePrice);
            System.out.println("Normal: " + calculatePrice(basePrice, normal));
            System.out.println("Student discount: " + calculatePrice(basePrice, student));
            System.out.println("Vip discount: " + calculatePrice(basePrice, vip));
            System.out.println("Black Friday discount: " + calculatePrice(basePrice, blackFriday));
            System.out.println();
        }
    }

    static double calculatePrice(double basePrice, PriceStrategy strategy) {
        return strategy.apply(basePrice);
    }

    @FunctionalInterface
    interface PriceStrategy {
        double apply(double basePrice);
    }
}



