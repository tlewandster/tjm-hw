package pl.tlewandster.task9;

public class Main {
    static void main() {

        // Zadanie 1: Walidator hasła (unchecked)
        PasswordValidator.validate("password1");

        // Zadanie 2: Parser liczby dodatniej (chaining, unchecked)
        NumberParser.parsePositiveInt("2");

        // Zadanie 3: Konto i wyjątek checked (throws)
        BankAccount account = new BankAccount(500);
        try {
            account.withdraw(2000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction Completed");
        }

        // Zadanie 4: Multi‑catch i decyzja o reakcji
        CommandProcessor.demo();

        // Zadanie 5: Walidacja adresu e-mail (regex)
        EmailValidator.validate("email@gmail.com");
    }
}
