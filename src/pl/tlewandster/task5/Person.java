package pl.tlewandster.task5;

@SuppressWarnings("JavaPrintToLogpoint")

public class Person {
    private String name;
    private int age;
    private static int numberOfPeople;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        numberOfPeople++;
    }

    Person(String name){
        this(name, age=0);
    }

    public static int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void introduceYourself() {
        System.out.printf("I am %s and I'm %d years old. %n", this.name, this.age);
    }

    public void introduceYourself(String greeting) {
        System.out.println(greeting);
        introduceYourself();
    }


}
