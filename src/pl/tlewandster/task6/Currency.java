package pl.tlewandster.task6;

public enum Currency {
    PLN("zł"), USD("$"), EUR("€");

    private final String symbol;

    public String getSymbol() {
        return symbol;
    }

    Currency(String symbol) {
        this.symbol = symbol;
    }
}
