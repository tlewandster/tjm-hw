package pl.tlewandster.task12;

import java.util.Arrays;
import java.util.function.Function;

public class Exercise_2 {
    static void main() {
        Function<String, String> trim = String::trim;
        Function<String, String> toLowerCase = String::toLowerCase;
        Function<String, String> removeSpaces = s -> s.replace(" ", "");
        Function<String, String> normalizeLogin = trim.andThen(toLowerCase.andThen(removeSpaces));
        String[] logins = {"  Adam  ", "ANIA K  ", "  k o w a l "};
        String[] normalizedLogins = new String[logins.length];
        for (int i = 0; i < logins.length; i++) {
            normalizedLogins[i] = normalizeLogin.apply(logins[i]);
        }
        System.out.println(Arrays.toString(normalizedLogins)); // [adam, aniak, kowal]
    }
}
