package pl.tlewandster.task6;

public enum Planet {
    EARTH(5.97e24, 6.37e6), MARS(6.42e23,3.39e6 ), JUPITER(1.90e27,6.99e7);

    private final double mass;
    private final double radius;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    double getDensity() {
        return mass / ( 4.0 / 3 * Math.PI * radius * radius * radius);
    }
}
