package pl.tlewandster.task9;

import java.util.regex.Pattern;

abstract class EmailValidationException extends RuntimeException {
    public EmailValidationException(String msg){
        super(msg);
    }
}

class NullEmailException extends EmailValidationException {
    public NullEmailException(String msg) {
        super(msg);
    }
}

class InvalidEmailFormatException extends EmailValidationException{
    public InvalidEmailFormatException(String msg) {
        super(msg);
    }
}

public final class EmailValidator {
    private EmailValidator() {
    }

    private static final Pattern EMAIL = Pattern.compile("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$");

    public static void validate(String email) {
        if(email == null || email.isBlank()){
            throw new NullEmailException("The email cannot be blank or null");
        }
        if (!EMAIL.matcher(email).matches()){
            throw new InvalidEmailFormatException("Invalid email format: " + email);
        }
    }
}