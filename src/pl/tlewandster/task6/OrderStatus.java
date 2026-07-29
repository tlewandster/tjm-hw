package pl.tlewandster.task6;

public enum OrderStatus {
    NEW, PROCESSING, SHIPPED, DELIVERED, CANCELED;

    boolean isActive() {
        return switch (this) {
            case NEW, PROCESSING, SHIPPED -> true;
            case DELIVERED, CANCELED -> false;
        };
    }
}
