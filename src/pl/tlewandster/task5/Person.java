package pl.tlewandster.task5;

@SuppressWarnings("JavaPrintToLogpoint")

public class Person {
    private static int numberOfPeople;
    private final String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        numberOfPeople++;
    }

    Person(String name) {
        this(name, age = 0);
    }

    public static int getNumberOfPeople() {
        return numberOfPeople;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void introduceYourself() {
        System.out.printf("I am %s and I'm %d years old. %n", this.name, this.age);
    }

    public void introduceYourself(String greeting) {
        System.out.println(greeting);
        introduceYourself();
    }

    public boolean isAdult() {
        return this.age >= 18;
    }

    public int compareAge(Person other) {
        return Math.abs(this.age - other.age);
    }

}
