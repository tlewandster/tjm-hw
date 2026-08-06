package pl.tlewandster.task9;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

final class BankAccount {
    private int balance;

    public BankAccount(int initial) {
        this.balance = initial;
    }

    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount > this.balance) {
            throw new InsufficientFundsException("The amount being withdrawn exceeds the balance");
        } else {
            this.balance -= amount;
        }
    }
}