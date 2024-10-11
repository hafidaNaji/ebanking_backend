package net.naji.ebankingbackend.exception;

public class BankAccountNotFoundException extends Exception {
    public BankAccountNotFoundException(String bankAccountNotFound) {
        super(bankAccountNotFound);

    }
}
