package pl.tlewandster.task5;

public final class Utils {
    static final String SET_GREEN_FONT = "\u001B[32m";
    static final String RESET_FONT_COLOR = "\u001B[0m";

    private Utils() {}

    static void insertTitle(String title) {
        System.out.println(SET_GREEN_FONT + title + RESET_FONT_COLOR);
    }

    static void insertSeparator() {
        System.out.println("-".repeat(50));
    }
}
