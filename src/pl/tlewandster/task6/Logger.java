package pl.tlewandster.task6;

public enum Logger {
    INSTANCE;

    void log(String msg) {
        System.out.println(msg);
    }
}
