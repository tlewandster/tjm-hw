package pl.tlewandster.task12;

public class Exercise_1 {
    private static Runnable start = () -> System.out.println("Starting the program...");
    private static Runnable end = () -> System.out.println("Ending the program...");

    static void main() {
        start.run();
        new Thread(end).start();
    }
}
