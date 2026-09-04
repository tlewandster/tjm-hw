package pl.tlewandster.task12;

import java.util.function.Predicate;

public class Exercise_6 {
    static void main() {
        String[] logins = {"adam", "Ala123", "x", "User_01", "ADMIN", "gość"};
        Predicate<String> isValidLogin = login -> login.length() >= 3
                && login.matches("^[a-zA-Z][a-zA-Z0-9]*$");
        int numberCorrectLogins = 0;
        for (String login : logins) {
            if (isValidLogin.test(login)) {
                System.out.println(login);
                numberCorrectLogins++;
            }
        }
    }
}

