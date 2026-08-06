package pl.tlewandster.task9;

public final class PasswordValidator {
    private PasswordValidator() {
    }

    public static void validate(String pwd) {
        if (pwd == null || pwd.length() < 8) {
            throw new IllegalArgumentException("The password must be at least 8 characters long");
        }
        if (pwd.matches("^[^0-9]*$")) {
            throw new IllegalArgumentException("The password must contain at least 1 digit");
        }
    }
}
