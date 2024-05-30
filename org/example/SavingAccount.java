package org.example;

public class SavingAccount extends Account {

    public SavingAccount(String account, int password, String username, String id) {
        super(account, password, username, id);
    }

    @Override
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}