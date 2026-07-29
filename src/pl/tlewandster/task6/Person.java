package pl.tlewandster.task6;

public class Person {
    private final String name;
    private final DayOfWeek dayOff;

    public Person(String name, DayOfWeek dayOff) {
        this.name = name;
        this.dayOff = dayOff;
    }

    public String getName() {
        return name;
    }

    public DayOfWeek getDayOff() {
        return dayOff;
    }

    public DayOfWeek showDayOff() {
        return this.dayOff;
    }
}
