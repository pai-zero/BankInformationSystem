package org.example;

public class SavingAccount extends Account {

    public SavingAccount(String account, int password, String username, String id) {
        super(account, password, username, id);
    }

    @Override
    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return balance;
        }
        return 0.0;
    }

    @Override
    public double withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return balance;
        }
        return 0.0;
    }
}